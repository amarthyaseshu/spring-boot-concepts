package com.amarthya.spring_boot_concepts.dynamicbeanswitch.service.impl;

import com.amarthya.spring_boot_concepts.dynamicbeanswitch.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("stripe")
@Slf4j
public class StripePaymentService implements PaymentService {

    @Override
    public String pay(String amount, String mode, String sender, String receiver) {
        // Simulate payment processing logic
        log.info("Processing payment with Stripe: amount={}, mode={}, sender={}, receiver={}", amount, mode, sender, receiver);
        return "paid with stripe " + amount + " from " + sender + " to " + receiver + " using mode " + mode;
    }
}
