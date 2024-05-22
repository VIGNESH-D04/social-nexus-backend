package com.nexus.controller;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.nexus.exception.ChatException;
import com.nexus.exception.UserException;
import com.nexus.model.Chat;
import com.nexus.model.Message;
import com.nexus.model.User;
import com.nexus.service.ChatService;
import com.nexus.service.MessageService;
import com.nexus.service.UserService;



@RestController
public class RealTimeChat {
	
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private MessageService messageService;
    
    @Autowired
    private ChatService chatService;
	  
	@MessageMapping("/chat/{groupId}")
	public Message sendToUser(
		@Payload Message message, 
		@DestinationVariable String groupId) 
		throws UserException, ChatException {	

		simpMessagingTemplate.convertAndSendToUser(
			groupId, 
			"/private", 
			message
		);
		return message;
	}
	
	public User reciver(Chat chat,User reqUser) {
		Iterator<User> iterator = chat.getUsers().iterator();

		User user1 = iterator.next(); // get the first user
		User user2 = iterator.next();
		
		if(user1.getId().equals(reqUser.getId())){
			return user2;
		}
		return user1;
	}
	

	

}
