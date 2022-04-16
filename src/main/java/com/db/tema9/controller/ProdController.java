package com.db.tema9.controller;

import com.db.tema9.model.PaymentMethod;
import com.db.tema9.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Profile("prod")
public class ProdController {

    private final PaymentService paymentService;
    @PostMapping("/prod/{customerId}/{orderID}/{paymentMethod}")

    public String pay(@PathVariable("customerId") Integer customerId, @PathVariable("orderId") Integer orderId, @PathVariable("paymentMethod") PaymentMethod paymentMethod) {
        return paymentService.Payment(customerId, orderId, paymentMethod);
    }
}
