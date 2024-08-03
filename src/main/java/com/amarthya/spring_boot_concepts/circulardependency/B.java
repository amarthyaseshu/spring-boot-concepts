package com.amarthya.spring_boot_concepts.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class B {

    private A a;
    @Autowired
    public B(A a){
        this.a=a;
    }
}
