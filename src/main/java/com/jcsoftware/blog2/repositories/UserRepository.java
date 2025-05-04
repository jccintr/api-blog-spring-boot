package com.jcsoftware.blog2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcsoftware.blog2.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
