package com.nexus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexus.model.Comments;


public interface CommentRepository extends JpaRepository<Comments, Integer> {

}
