package com.jcsoftware.blog2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcsoftware.blog2.repositories.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;

}
