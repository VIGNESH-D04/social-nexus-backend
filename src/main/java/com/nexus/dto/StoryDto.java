package com.nexus.dto;

import java.time.LocalDateTime;

import com.nexus.model.User;

import lombok.Data;

@Data
public class StoryDto {

	private Integer id;
	private User user;
	private String image;
	private String captions;
	private LocalDateTime timestamp;
	
}
