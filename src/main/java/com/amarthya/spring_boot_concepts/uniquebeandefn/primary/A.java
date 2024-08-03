package com.amarthya.spring_boot_concepts.uniquebeandefn.primary;

import org.springframework.context.annotation.Primary;

@org.springframework.stereotype.Service
@Primary
public class A implements Service{
    @Override
    public void execute() {

    }
}
