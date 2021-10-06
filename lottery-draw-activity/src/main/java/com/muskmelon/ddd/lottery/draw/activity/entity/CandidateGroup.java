package com.muskmelon.ddd.lottery.draw.activity.entity;

import lombok.Data;

import java.util.List;

/**
 * 抽奖候选人
 *
 * @author muskmelon
 * @since 1.0
 */
@Data
public class CandidateGroup {

    /**
     * 标识符
     */
    private Long id;
    /**
     * 用户画像
     */
    private List<String> userProfileTags;
}
