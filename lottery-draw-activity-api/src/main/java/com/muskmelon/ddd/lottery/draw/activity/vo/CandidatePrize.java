package com.muskmelon.ddd.lottery.draw.activity.vo;

import lombok.Data;

/**
 * 奖品值对象
 *
 * @author muskmelon
 * @since 1.0
 */
@Data
public class CandidatePrize {

    /**
     * 奖品id
     */
    private Long prizeId;

    /**
     * 奖品抽中的概率
     */
    private Double probability;

    /**
     * 对这个奖品最多可以抽中几次
     */
    private Integer drawChancePerCandidate;

}
