package com.ikauedev.proxyclient.business.auth.service;

import com.ikauedev.proxyclient.business.auth.model.request.AuthenticationRequest;
import com.ikauedev.proxyclient.business.auth.model.response.AuthenticationResponse;

public interface AuthenticationService {

    AuthenticationResponse authenticate(final AuthenticationRequest authenticationRequest);
    Boolean authenticate(final String jwt);

}