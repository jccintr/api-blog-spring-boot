package com.jcsoftware.blog2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcsoftware.blog2.entities.Post;

public interface PostRepository extends JpaRepository<Post,Long> {

	
}
