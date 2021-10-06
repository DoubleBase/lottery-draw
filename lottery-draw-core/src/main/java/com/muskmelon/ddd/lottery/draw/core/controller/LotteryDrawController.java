package com.muskmelon.ddd.lottery.draw.core.controller;

import com.muskmelon.ddd.lottery.draw.activity.api.ILotteryDrawActivity;
import com.muskmelon.ddd.lottery.draw.core.entity.DrawLottery;
import com.muskmelon.ddd.lottery.draw.core.spring.SpringContext;
import com.muskmelon.ddd.lottery.draw.risk.control.api.RiskControlApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author muskmelon
 * @since 1.0
 */
@RestController
public class LotteryDrawController {

    @Autowired
    private SpringContext springContext;

    @GetMapping("/draw-lottery")
    public String drawLottery(Long userId, Long lotteryDrawActivityId) {
        System.out.println("用户[" + userId + "]进行抽奖，抽奖活动为：" + lotteryDrawActivityId);

        DrawLottery drawLottery = springContext.getBean(DrawLottery.class);
        drawLottery.setUserId(userId);
        drawLottery.setLotteryDrawActivityId(lotteryDrawActivityId);

        return drawLottery.execute();
    }

}
