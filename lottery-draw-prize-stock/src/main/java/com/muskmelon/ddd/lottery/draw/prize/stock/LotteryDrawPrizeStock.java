package com.muskmelon.ddd.lottery.draw.prize.stock;

import com.muskmelon.ddd.lottery.draw.prize.stock.db.DruidDataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author muskmelon
 * @description
 * @date 2020-9-5 14:06
 * @since 1.0
 */
@SpringBootApplication
@Import(DruidDataSourceConfig.class)
public class LotteryDrawPrizeStock {

    public static void main(String[] args) {
        SpringApplication.run(LotteryDrawPrizeStock.class, args);
    }

}
