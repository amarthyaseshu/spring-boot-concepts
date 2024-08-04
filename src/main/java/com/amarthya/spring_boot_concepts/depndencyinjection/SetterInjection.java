package com.amarthya.spring_boot_concepts.depndencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection {

    private IndependentClass independentClass;
    // Setter injection
    @Autowired
    public void setIndependentClass(IndependentClass independentClass){
        this.independentClass=independentClass;
    }
}
