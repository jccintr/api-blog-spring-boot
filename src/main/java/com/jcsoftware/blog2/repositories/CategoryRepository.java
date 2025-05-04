package com.jcsoftware.blog2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcsoftware.blog2.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}
