package com.muskmelon.ddd.lottery.draw.activity.entity;

import com.muskmelon.ddd.lottery.draw.activity.api.ILotteryDrawActivity;
import com.muskmelon.ddd.lottery.draw.activity.dao.LotteryDrawActivityDAO;
import com.muskmelon.ddd.lottery.draw.activity.data.LotteryDrawActivityDO;
import com.muskmelon.ddd.lottery.draw.activity.vo.DrawLotteryContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 抽奖活动
 *
 * @author muskmelon
 * @since 1.0
 */
@Component
@Scope("prototype")
public class LotteryDrawActivity implements ILotteryDrawActivity {

    /**
     * 实体标识符
     */
    private Long id;
    /**
     * 抽奖活动开始时间
     */
    private String startTime;
    /**
     * 抽奖活动结束时间
     */
    private String endTime;
    /**
     * 奖品集合
     */
    private List<Prize> prizeList;
    /**
     * 抽奖活动候选人
     */
    private CandidateGroup candidateGroup;
    /**
     * 每个抽奖候选人的抽奖次数
     */
    private Integer drawChancePerCandidate;

    @Autowired
    private LotteryDrawActivityDAO lotteryDrawActivityDAO;

    @Override
    public DrawLotteryContext getContext() {
        // 从数据库中去查询
        LotteryDrawActivityDO lotteryDrawActivityDO = lotteryDrawActivityDAO.selectById(id);
        // 将数据库中查询到的抽奖活动转换为抽奖上下文值对象
        System.out.println("将数据库中查询到的抽奖活动转换为抽奖上下文值对象");

        return null;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
