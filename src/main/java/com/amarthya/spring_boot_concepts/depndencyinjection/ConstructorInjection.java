package com.amarthya.spring_boot_concepts.depndencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {

    private final IndependentClass independentClass;
    // Constructor Injection
    //from spring boot 4.3 @Autowired not required
    // Instantiation & injection done at same time
    // provides object immutability of IndependentClass
    // Order of dependencies can be found
    // Recommended
    @Autowired
    private ConstructorInjection(IndependentClass independentClass){
        this.independentClass=independentClass;
    }
}
