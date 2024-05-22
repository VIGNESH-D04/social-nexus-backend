package com.nexus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexus.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {

	PasswordResetToken findByToken(String token);

}
