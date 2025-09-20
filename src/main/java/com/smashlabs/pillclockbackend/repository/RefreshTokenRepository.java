package com.smashlabs.pillclockbackend.repository;

import com.smashlabs.pillclockbackend.entity.RefreshToken;
import com.smashlabs.pillclockbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

    Optional<RefreshToken> findByUserAndDeviceId(User user, String deviceId);

    Optional<RefreshToken> findByDeviceId(String deviceId);

    void deleteByUserAndDeviceId(User user, String deviceId);

    void deleteByUser(User user); // For logout all devices
}
