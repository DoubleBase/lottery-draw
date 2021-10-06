package com.muskmelon.ddd.lottery.draw.activity.api;

import com.muskmelon.ddd.lottery.draw.activity.vo.DrawLotteryContext;

/**
 * @author muskmelon
 * @since 1.0
 */
public interface LotteryDrawActivityApi {

    /**
     * 获取抽奖活动数据
     * @param lotteryDrawActivityId 抽奖活动id
     * @return 抽奖活动
     */
    DrawLotteryContext getContext(Long lotteryDrawActivityId);

}
