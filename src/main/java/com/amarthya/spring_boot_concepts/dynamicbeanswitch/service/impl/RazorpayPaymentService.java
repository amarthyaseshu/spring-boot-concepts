package com.amarthya.spring_boot_concepts.dynamicbeanswitch.service.impl;

import com.amarthya.spring_boot_concepts.dynamicbeanswitch.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("razorpay")
@Slf4j
public class RazorpayPaymentService implements PaymentService {

    @Override
    public String pay(String amount, String mode, String sender, String receiver) {
        log.info("Processing payment with Razorpay: amount={}, mode={}, sender={}, receiver={}", amount, mode, sender, receiver);
        return "paid with razorpay " + amount + " from " + sender + " to " + receiver + " using mode " + mode;
    }
}
