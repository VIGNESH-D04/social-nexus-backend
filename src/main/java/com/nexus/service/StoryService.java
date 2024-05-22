package com.nexus.service;

import java.util.List;

import com.nexus.exception.StoryException;
import com.nexus.exception.UserException;
import com.nexus.model.Story;

public interface StoryService {

	public Story createStory(Story story,Integer userId) throws UserException;
	
	public List<Story> findStoryByUserId(Integer userId) throws UserException, StoryException;
	
	
}
