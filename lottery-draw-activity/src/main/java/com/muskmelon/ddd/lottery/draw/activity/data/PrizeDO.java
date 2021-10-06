package com.muskmelon.ddd.lottery.draw.activity.data;

import lombok.Data;

/**
 * 奖品
 *
 * @author muskmelon
 * @since 1.0
 */
@Data
public class PrizeDO {

    /**
     * 标识符
     */
    private Long id;
    /**
     * 奖品类型：优惠券、虚拟金币、实物商品
     */
    private String prizeType;
    /**
     * 奖品细节，JSON格式
     * 优惠券：面额，使用范围
     * 虚拟金币：金币数量
     * 实物商品：商品id
     */
    private String prizeDetail;
    /**
     * 抽中的概率
     */
    private Double probability;
    /**
     * 对这个奖品最多可以抽中几次
     */
    private Integer drawChancePerCandidate;
}
