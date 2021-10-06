package com.muskmelon.ddd.lottery.draw.risk.control.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author muskmelon
 * @since 1.0
 */
@Component
public class SpringContext {

    /**
     * spring容器
     */
    private ApplicationContext context;

    @Autowired
    public SpringContext(ApplicationContext context) {
        this.context = context;
    }

    /**
     * 获取bean
     *
     * @param clazz bean类型
     * @param <T>  类型
     * @return bean实例
     */
    public <T> T getBean(Class<? extends T> clazz) {
        return context.getBean(clazz);
    }

}
