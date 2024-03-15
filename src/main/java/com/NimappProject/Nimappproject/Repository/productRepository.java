package com.NimappProject.Nimappproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Product;

public interface productRepository extends JpaRepository<Product, Integer> {
}
