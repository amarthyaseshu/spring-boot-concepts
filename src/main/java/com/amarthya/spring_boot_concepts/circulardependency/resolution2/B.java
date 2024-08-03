package com.amarthya.spring_boot_concepts.circulardependency.resolution2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class B {

    private A a;
    @Autowired
    public B(@Lazy A a){
        this.a=a;
    }
}
