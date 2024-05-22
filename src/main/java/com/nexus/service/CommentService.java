package com.nexus.service;

import com.nexus.exception.CommentException;
import com.nexus.exception.PostException;
import com.nexus.exception.UserException;
import com.nexus.model.Comments;

public interface CommentService {
	
	public Comments createComment(Comments comment,Integer postId,Integer userId) throws PostException, UserException;

	public Comments findCommentById(Integer commentId) throws CommentException;
	public Comments likeComment(Integer CommentId,Integer userId) 
			throws UserException, CommentException;
}
