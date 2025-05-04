package com.jcsoftware.blog2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcsoftware.blog2.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long>{

}
