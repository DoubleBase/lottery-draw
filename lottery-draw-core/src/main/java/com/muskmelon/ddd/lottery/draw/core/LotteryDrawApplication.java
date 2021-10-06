package com.muskmelon.ddd.lottery.draw.core;

import com.muskmelon.ddd.lottery.draw.core.db.DruidDataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Import;

/**
 * @author muskmelon
 * @description
 * @date 2020-9-5 14:06
 * @since 1.0
 */
@SpringBootConfiguration
@EnableAutoConfiguration
@Import(DruidDataSourceConfig.class)
@ComponentScan(value = "com.muskmelon.ddd.lottery.draw")
public class LotteryDrawApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryDrawApplication.class, args);
    }

}
