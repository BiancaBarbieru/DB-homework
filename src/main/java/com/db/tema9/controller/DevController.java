package com.db.tema9.controller;

import com.db.tema9.model.PaymentMethod;
import com.db.tema9.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Profile("@dev")
public class DevController {
    private final PaymentService paymentService;

    @PostMapping("/dev/{customerId}/{orderId}/{paymentMethod}")
    public String pay(@PathVariable("customerId") Integer customerId, @PathVariable("orderId") Integer orderId, @PathVariable("paymentMethod") PaymentMethod paymentMethod) {
        return paymentService.Payment(customerId, orderId, paymentMethod);
    }
}
