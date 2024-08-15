package com.amarthya.spring_boot_concepts.beanprepostinit;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleBean implements InitializingBean, DisposableBean {

    @PostConstruct
    public void init(){
        //called just after bean initialized
    }

    @PreDestroy
    public void complete(){
        //called before bean destroyed
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //same as @PostCosntruct
    }

    @Override
    public void destroy() throws Exception {
        //same as @PreDestroy
    }
}
