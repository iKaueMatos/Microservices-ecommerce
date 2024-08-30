package com.ikauedev.inventoryservice.dto.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryResponse {
    private String productName;
    private boolean isInStock;
}