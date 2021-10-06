package com.muskmelon.ddd.lottery.draw.activity.vo;

import lombok.Data;

import java.util.List;

/**
 * 抽奖上下文
 *
 * @author muskmelon
 * @since 1.0
 */
@Data
public class DrawLotteryContext {

    /**
     * 抽奖活动id
     */
    private Long lotteryDrawActivityId;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 奖品集合
     */
    private List<CandidatePrize> prizes;

    /**
     * 每个抽奖候选人的抽奖次数
     */
    private Integer drawChancePerCandidate;
}
