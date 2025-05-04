package com.jcsoftware.blog2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcsoftware.blog2.repositories.CommentRepository;

@Service
public class CommentService {
	
	@Autowired
	private CommentRepository repository;

}
