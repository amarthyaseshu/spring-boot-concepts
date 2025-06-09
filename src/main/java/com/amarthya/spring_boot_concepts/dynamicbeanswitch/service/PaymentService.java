package com.amarthya.spring_boot_concepts.dynamicbeanswitch.service;

public interface PaymentService {

    String pay(String amount,String mode,
               String sender, String receiver);
}
