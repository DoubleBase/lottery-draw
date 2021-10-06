package com.muskmelon.ddd.lottery.draw.activity.data;

import java.util.List;

/**
 * 抽奖活动
 *
 * @author muskmelon
 * @since 1.0
 */
public class LotteryDrawActivityDO {

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
    private List<PrizeDO> prizeList;
    /**
     * 抽奖活动候选人
     */
    private CandidateGroupDO candidateGroup;
    /**
     * 每个抽奖候选人的抽奖次数
     */
    private Integer drawChancePerCandidate;

}
