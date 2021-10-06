package com.muskmelon.ddd.lottery.draw.risk.control.api;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author muskmelon
 * @since 1.0
 */
@Component
@Scope("prototype")
public class RiskControlAlgorithmRef implements IRiskControlAlgorithm {

    @Reference(version = "1.0.0",
            interfaceClass = RiskControlApi.class,
            cluster = "failfast")
    private RiskControlApi riskControlService;

    private Long userId;

    @Override
    public Boolean intercept() {
        return riskControlService.intercept(userId);
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
