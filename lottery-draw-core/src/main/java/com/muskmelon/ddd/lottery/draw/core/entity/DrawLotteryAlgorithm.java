package com.muskmelon.ddd.lottery.draw.core.entity;

import com.muskmelon.ddd.lottery.draw.activity.vo.DrawLotteryContext;
import com.muskmelon.ddd.lottery.draw.activity.vo.WinPrize;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 抽奖算法
 *
 * @author muskmelon
 * @since 1.0
 */
@Component
@Scope("prototype")
public class DrawLotteryAlgorithm {

    private DrawLotteryContext context;

    public void setContext(DrawLotteryContext context) {
        this.context = context;
    }

    /**
     * 执行抽奖算法
     *
     * @return 中奖的奖品
     */
    public WinPrize execute() {
        System.out.println("检查用户已经参与过几次抽奖......");
        System.out.println("根据每个奖品的抽中概率执行抽奖算法.....");
        System.out.println("对抽中的奖品检查用户已经抽中过几次，是否还能抽中......");
        return null;
    }

}
