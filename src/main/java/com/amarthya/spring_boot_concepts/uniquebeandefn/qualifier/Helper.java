package com.amarthya.spring_boot_concepts.uniquebeandefn.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Helper {

    @Autowired
    @Qualifier("A")
    Service service;

    public void test(){
        service.execute();
    }
}
