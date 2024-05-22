package com.nexus.service;

import java.util.List;

import com.nexus.exception.ChatException;
import com.nexus.exception.MessageException;
import com.nexus.exception.UserException;
import com.nexus.model.Message;
import com.nexus.request.SendMessageRequest;

public interface MessageService  {
	
	public Message sendMessage(SendMessageRequest req) throws UserException, ChatException;
	
	public List<Message> getChatsMessages(Integer chatId) throws ChatException;
	
	public Message findMessageById(Integer messageId) throws MessageException;
	
	public String deleteMessage(Integer messageId) throws MessageException;

}
