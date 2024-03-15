package com.NimappProject.Nimappproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Category;



public interface categoryRepository extends JpaRepository<Category, Integer> {
}