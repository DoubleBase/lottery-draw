package com.muskmelon.ddd.lottery.draw.activity.dao;

import com.muskmelon.ddd.lottery.draw.activity.data.LotteryDrawActivityDO;

/**
 * @author muskmelon
 * @since 1.0
 */
public interface LotteryDrawActivityDAO {

    /**
     * 根据id查询抽奖活动
     *
     * @param id
     * @return
     */
    LotteryDrawActivityDO selectById(Long id);
}
