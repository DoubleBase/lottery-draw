package com.muskmelon.ddd.lottery.draw.core.entity;

import com.muskmelon.ddd.lottery.draw.activity.api.LotteryDrawActivityRef;
import com.muskmelon.ddd.lottery.draw.activity.vo.DrawLotteryContext;
import com.muskmelon.ddd.lottery.draw.activity.vo.WinPrize;
import com.muskmelon.ddd.lottery.draw.core.spring.SpringContext;
import com.muskmelon.ddd.lottery.draw.risk.control.api.RiskControlAlgorithmRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 抽奖行为
 *
 * @author muskmelon
 * @since 1.0
 */
@Component
@Scope("prototype")
public class DrawLottery {

    /**
     * 一次抽奖行为的标识符
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 抽奖活动id
     */
    private Long lotteryDrawActivityId;

    @Autowired
    private SpringContext springContext;

    /**
     * 执行抽奖
     */
    public String execute() {
        // 先进行风控，判断用户是否可以进行抽奖
        RiskControlAlgorithmRef riskControlAlgorithmRef = springContext.getBean(RiskControlAlgorithmRef.class);
        riskControlAlgorithmRef.setUserId(userId);
        Boolean riskControlResult = riskControlAlgorithmRef.intercept();
        if (!riskControlResult) {
            return "风控拦截,用户有风险行为，不允许执行抽奖";
        }

        LotteryDrawActivityRef lotteryDrawActivityRef = springContext.getBean(LotteryDrawActivityRef.class);
        lotteryDrawActivityRef.setId(lotteryDrawActivityId);
        // 获取抽奖活动
        DrawLotteryContext context = lotteryDrawActivityRef.getContext();
        // 使用抽奖算法进行抽奖
        DrawLotteryAlgorithm drawLotteryAlgorithm = springContext.getBean(DrawLotteryAlgorithm.class);
        drawLotteryAlgorithm.setContext(context);
        WinPrize winPrize = drawLotteryAlgorithm.execute();

        return "抽奖成功";
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setLotteryDrawActivityId(Long lotteryDrawActivityId) {
        this.lotteryDrawActivityId = lotteryDrawActivityId;
    }
}
