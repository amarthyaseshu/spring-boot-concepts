package com.amarthya.spring_boot_concepts.uniquebeandefn.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Helper {

    @Autowired
    Service service;

    public void test(){
        service.execute();
    }
}
