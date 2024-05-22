package com.nexus.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
	

	private String firstName;
	private String lastName;
	private String email;
	private Integer id;
	private String image;
	
}
