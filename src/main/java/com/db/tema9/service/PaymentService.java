package com.db.tema9.service;

import com.db.tema9.model.PaymentMethod;
import com.db.tema9.repository.CustomerRepo;
import com.db.tema9.repository.OrderRepo;
import com.db.tema9.repository.PaymentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PaymentService {
    private final CustomerRepo customerRepository;
    private final OrderRepo orderRepository;
    private final PaymentRepo paymentRepository;

    public String Payment(Integer customerId, Integer orderId, PaymentMethod paymentMethod){
        if (orderRepository.getById(orderId).getPrice() < 5000.0)
            return "Customer with id: " + customerRepository.getById(customerId) + "payed: " + orderRepository.getById(orderId).getPrice() + "with: " + paymentMethod;
        else if (paymentMethod != PaymentMethod.CARD) {
            return "Invalid payment method!";
        }
        return "Customer with id: " + customerRepository.getById(customerId) + "payed: " + orderRepository.getById(orderId).getPrice() + "with: " + PaymentMethod.CARD;
    }
}
