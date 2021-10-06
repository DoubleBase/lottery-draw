package com.muskmelon.ddd.lottery.draw.activity.api;

import com.muskmelon.ddd.lottery.draw.activity.vo.DrawLotteryContext;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 抽奖活动实体引用
 *
 * @author muskmelon
 * @since 1.0
 */
@Component
@Scope("prototype")
public class LotteryDrawActivityRef implements ILotteryDrawActivity{

    @Reference(version = "1.0.0",
            interfaceClass = LotteryDrawActivityApi.class,
            cluster = "failfast")
    private LotteryDrawActivityApi lotteryDrawActivityService;

    /**
     * 抽奖活动实体标识符
     */
    private Long id;

    @Override
    public DrawLotteryContext getContext() {
        return lotteryDrawActivityService.getContext(id);
    }

    public void setId(Long id) {
        this.id = id;
    }
}
