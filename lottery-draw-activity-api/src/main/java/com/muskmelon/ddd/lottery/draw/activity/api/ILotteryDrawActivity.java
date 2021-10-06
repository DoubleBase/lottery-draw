package com.muskmelon.ddd.lottery.draw.activity.api;

import com.muskmelon.ddd.lottery.draw.activity.vo.DrawLotteryContext;

/**
 * @author muskmelon
 * @since 1.0
 */
public interface ILotteryDrawActivity {

    /**
     * 获取抽奖活动数据
     * @return 抽奖活动
     */
    DrawLotteryContext getContext();

}
