package com.amarthya.spring_boot_concepts.propertysource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// SB only reads properties from application.properties, if we want to read from
//other properties files then need to define with @PropertySource like below
@Configuration
@PropertySource("classpath:myconfig.properties")
public class Configs {

    @Value("$data")
    private String data;
}
