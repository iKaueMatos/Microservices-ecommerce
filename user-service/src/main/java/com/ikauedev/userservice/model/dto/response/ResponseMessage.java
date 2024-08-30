package com.ikauedev.userservice.model.dto.response;

import lombok.*;

import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ResponseMessage {
    @Size(min = 10, max = 500)
    private String message;
}