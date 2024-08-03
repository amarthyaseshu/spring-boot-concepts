package com.amarthya.spring_boot_concepts.circulardependency.resolution1;

import com.amarthya.spring_boot_concepts.circulardependency.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class B {

    private A a;
    @Autowired
    public void setA(A a) {
        this.a = a;
    }
}
