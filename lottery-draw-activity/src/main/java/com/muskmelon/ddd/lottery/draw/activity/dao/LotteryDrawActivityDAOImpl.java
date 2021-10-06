package com.muskmelon.ddd.lottery.draw.activity.dao;

import com.muskmelon.ddd.lottery.draw.activity.data.LotteryDrawActivityDO;
import org.springframework.stereotype.Repository;

/**
 * @author muskmelon
 * @since 1.0
 */
@Repository
public class LotteryDrawActivityDAOImpl implements LotteryDrawActivityDAO {

    @Override
    public LotteryDrawActivityDO selectById(Long id) {
        System.out.println("根据id查询抽奖活动");
        return null;
    }
}
