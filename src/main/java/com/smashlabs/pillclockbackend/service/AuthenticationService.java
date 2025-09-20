package com.smashlabs.pillclockbackend.service;

import com.smashlabs.pillclockbackend.model.*;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {
    JwtResponse registerUser(RegisterRequest registerRequest);

    JwtResponse loginUser(LoginRequest loginRequest);

    JwtResponse refreshToken(RefreshTokenRequest refreshTokenRequest);

    void logoutUser(LogoutRequest logoutRequest);

    void logoutUserFromAllDevices(LogoutAllDevicesRequest logoutAllDevicesRequest);


}
