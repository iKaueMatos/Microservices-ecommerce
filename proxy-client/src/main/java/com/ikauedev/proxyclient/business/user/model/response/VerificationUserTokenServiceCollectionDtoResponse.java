package com.ikauedev.proxyclient.business.user.model.response;

import java.io.Serial;
import java.io.Serializable;
import java.util.Collection;

import com.ikauedev.proxyclient.business.user.model.VerificationTokenDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class VerificationUserTokenServiceCollectionDtoResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private Collection<VerificationTokenDto> collection;

}
