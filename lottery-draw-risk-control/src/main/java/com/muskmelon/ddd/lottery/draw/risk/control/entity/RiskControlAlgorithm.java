package com.muskmelon.ddd.lottery.draw.risk.control.entity;

import com.muskmelon.ddd.lottery.draw.risk.control.api.IRiskControlAlgorithm;
import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 风控算法
 *
 * @author muskmelon
 * @since 1.0
 */
@Component
@Scope("prototype")
public class RiskControlAlgorithm implements IRiskControlAlgorithm {

    /**
     * 标识符
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 执行具体的风控算法和逻辑，检查用户是否被风控
     *
     * @return 风控结果
     */
    @Override
    public Boolean intercept() {
        System.out.println("对用户userId=[" + userId + "]进行风控检查");
        return true;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
