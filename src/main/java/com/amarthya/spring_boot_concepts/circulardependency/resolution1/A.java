package com.amarthya.spring_boot_concepts.circulardependency.resolution1;

import com.amarthya.spring_boot_concepts.circulardependency.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
    private B b;
    @Autowired
    public void setB(B b) {
        this.b = b;
    }
}
