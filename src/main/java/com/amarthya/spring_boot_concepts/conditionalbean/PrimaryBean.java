package com.amarthya.spring_boot_concepts.conditionalbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrimaryBean {

    @Bean
    public PrimaryService primaryService() {
        return new PrimaryService();
    }
}
