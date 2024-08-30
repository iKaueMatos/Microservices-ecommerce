package com.ikauedev.notificationservice.api;

import com.ikauedev.notificationservice.dto.PaymentDto;
import com.ikauedev.notificationservice.entity.Payment;
import com.ikauedev.notificationservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public Mono<Payment> savePayment(@RequestBody PaymentDto paymentDto) {
        return paymentService.savePayment(paymentDto);
    }

    @GetMapping("/{paymentId}")
    public Mono<Payment> getPayment(@PathVariable Integer paymentId) {
        return paymentService.getPayment(paymentId);
    }

    @GetMapping
    public Mono<List<Payment>> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @DeleteMapping("/{paymentId}")
    public Mono<Void> deletePayment(@PathVariable Integer paymentId) {
        return paymentService.deletePayment(paymentId);
    }

}