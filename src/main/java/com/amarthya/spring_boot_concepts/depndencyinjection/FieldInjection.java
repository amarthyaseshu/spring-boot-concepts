package com.amarthya.spring_boot_concepts.depndencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjection {

    // Spring uses reflection API to do field injection, done in run time
    @Autowired
    private IndependentClass independentClass;


}
