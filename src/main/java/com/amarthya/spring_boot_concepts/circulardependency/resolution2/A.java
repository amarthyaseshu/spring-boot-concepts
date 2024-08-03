package com.amarthya.spring_boot_concepts.circulardependency.resolution2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class A {
    private B b;
    @Autowired
    public A(@Lazy B b){
        this.b=b;
    }
}
