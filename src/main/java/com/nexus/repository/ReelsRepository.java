package com.nexus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexus.model.Reels;

public interface ReelsRepository extends JpaRepository<Reels, Long> {
	
	public List<Reels> findByUserId(Integer  userId);

}
