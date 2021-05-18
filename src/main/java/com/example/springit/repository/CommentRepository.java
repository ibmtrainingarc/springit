package com.example.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springit.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
	
}
