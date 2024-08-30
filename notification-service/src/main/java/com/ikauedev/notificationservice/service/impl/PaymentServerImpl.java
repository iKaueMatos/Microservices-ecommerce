package com.ikauedev.notificationservice.service.impl;

import com.ikauedev.notificationservice.dto.PaymentDto;
import com.ikauedev.notificationservice.entity.Payment;
import com.ikauedev.notificationservice.helper.PaymentMappingHelper;
import com.ikauedev.notificationservice.repository.PaymentRepository;
import com.ikauedev.notificationservice.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@Slf4j
public class PaymentServerImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentServerImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Mono<Payment> savePayment(PaymentDto paymentDto) {
        return Mono.fromSupplier(() -> paymentRepository.save(PaymentMappingHelper.map(paymentDto)))
                .onErrorResume(throwable -> {
                    log.error("Error saving payment: {}", throwable.getMessage());
                    return Mono.error(throwable);
                });
    }

    @Override
    public Mono<Payment> getPayment(Integer paymentId) {
        return Mono.fromSupplier(() -> paymentRepository.findById(paymentId.toString())
                        .orElse(null));
    }

    @Override
    public Mono<List<Payment>> getAllPayments() {
        return Mono.fromSupplier(paymentRepository::findAll)
                .onErrorResume(throwable -> {
                    log.error("Error fetching user info: {}", throwable.getMessage());
                    return Mono.empty();
                });
    }

    @Override
    public Mono<Void> deletePayment(Integer paymentId) {
        log.info("Void, service; delete payment by id");
        return Mono.fromRunnable(() -> paymentRepository.deleteById(paymentId.toString()));
    }
}
