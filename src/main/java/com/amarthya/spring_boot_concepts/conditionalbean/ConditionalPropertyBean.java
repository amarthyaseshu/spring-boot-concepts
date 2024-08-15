package com.amarthya.spring_boot_concepts.conditionalbean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "db.active",havingValue = "true")
public class ConditionalPropertyBean {
}
