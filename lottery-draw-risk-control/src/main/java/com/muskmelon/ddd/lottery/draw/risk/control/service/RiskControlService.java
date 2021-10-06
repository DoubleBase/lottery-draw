package com.muskmelon.ddd.lottery.draw.risk.control.service;

import com.muskmelon.ddd.lottery.draw.risk.control.api.RiskControlApi;
import com.muskmelon.ddd.lottery.draw.risk.control.entity.RiskControlAlgorithm;
import com.muskmelon.ddd.lottery.draw.risk.control.spring.SpringContext;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 风控服务
 *
 * @author muskmelon
 * @since 1.0
 */
@Service(
        version = "1.0.0",
        interfaceClass = RiskControlApi.class,
        cluster = "failfast",
        loadbalance = "roundrobin"
)
public class RiskControlService implements RiskControlApi {

    @Autowired
    private SpringContext springContext;

    /**
     * 执行具体的风控算法和逻辑，检查用户是否被风控
     *
     * @param userId 用户id
     * @return 风控结果
     */
    @Override
    public Boolean intercept(Long userId) {
        // 接收到RPC请求，还原出来一个实体
        RiskControlAlgorithm riskControlAlgorithm = springContext.getBean(RiskControlAlgorithm.class);
        riskControlAlgorithm.setUserId(userId);
        return riskControlAlgorithm.intercept();
    }

    /**
     * 背后每天应该都是在凌晨的时候，离线大数据+机器学习去做一些运算，识别出一些有风险的用户/行为
     * 实时大数据+机器学习，实时的对用户的行为进行风控
     */


}
