package com.muskmelon.ddd.lottery.draw.risk.control;

import com.muskmelon.ddd.lottery.draw.risk.control.db.DruidDataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author muskmelon
 * @description
 * @date 2020-9-5 14:06
 * @since 1.0
 */
@SpringBootApplication
@Import(DruidDataSourceConfig.class)
public class LotteryDrawRiskControl {

    public static void main(String[] args) {
        SpringApplication.run(LotteryDrawRiskControl.class, args);

    }

}
