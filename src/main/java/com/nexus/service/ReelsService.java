package com.nexus.service;

import java.util.List;

import com.nexus.exception.UserException;
import com.nexus.model.Reels;
import com.nexus.model.User;

public interface ReelsService {
	
	public Reels createReel(Reels reel,User user);
	public List<Reels> findAllReels();
	public List<Reels> findUsersReel(Integer userId) throws UserException;

}
