package com.example.SpringBoot_Course.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class beanConf {

    @Bean
    public String beanConf_First() {
        return "This is beanConf_First";
    }

    @Bean
    public String beanConf_Second() {
        return "This is beanConf_Second";
    }

    @Bean
    @Qualifier("bean1")
    @Profile("dev")
    public firstBean getBeanComponent() {
        return new firstBean("Minh Nhut First");
    }

    @Bean
    @Qualifier("bean2")
    @Profile("test")
    public firstBean getBeanComponent_Second() {
        return new firstBean("Minh Nhut second");
    }

    @Bean
    public firstBean getBeanComponent_Priamry() {
        return new firstBean("Minh Nhut Primary");
    }

}
