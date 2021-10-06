package com.muskmelon.ddd.lottery.draw.risk.control.api;

/**
 * @author muskmelon
 * @since 1.0
 */
public interface IRiskControlAlgorithm {

    /**
     * 针对指定用户，进行风险控制检查
     *
     * @return 风控检查结果
     */
    Boolean intercept();

}
