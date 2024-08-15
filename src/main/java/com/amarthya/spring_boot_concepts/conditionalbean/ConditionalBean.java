package com.amarthya.spring_boot_concepts.conditionalbean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalBean {

    @ConditionalOnBean(value = PrimaryService.class)
    @Bean
    public String Bean(){
        return "";
    }
}
