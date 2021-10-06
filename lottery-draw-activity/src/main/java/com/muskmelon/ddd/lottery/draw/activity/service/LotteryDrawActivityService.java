package com.muskmelon.ddd.lottery.draw.activity.service;

import com.muskmelon.ddd.lottery.draw.activity.api.LotteryDrawActivityApi;
import com.muskmelon.ddd.lottery.draw.activity.entity.LotteryDrawActivity;
import com.muskmelon.ddd.lottery.draw.activity.spring.SpringContext;
import com.muskmelon.ddd.lottery.draw.activity.vo.DrawLotteryContext;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 抽奖活动
 *
 * @author muskmelon
 * @since 1.0
 */
@Service(
        version = "1.0.0",
        interfaceClass = LotteryDrawActivityApi.class,
        cluster = "failfast",
        loadbalance = "roundrobin"
)
public class LotteryDrawActivityService implements LotteryDrawActivityApi {

    @Autowired
    private SpringContext springContext;

    @Override
    public DrawLotteryContext getContext(Long lotteryDrawActivityId) {
        System.out.println("查询抽奖活动......");
        LotteryDrawActivity lotteryDrawActivity = springContext.getBean(LotteryDrawActivity.class);
        lotteryDrawActivity.setId(lotteryDrawActivityId);
        return lotteryDrawActivity.getContext();
    }
}
