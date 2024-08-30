package com.ikauedev.paymentservice.dto;

import com.ikauedev.paymentservice.entity.PaymentStatus;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
@Builder
public class KafkaPaymentDto {
    private Integer paymentId;
    private Boolean isPayed;
    private PaymentStatus paymentStatus;
    private Integer orderId;
    private Long userId;
}
