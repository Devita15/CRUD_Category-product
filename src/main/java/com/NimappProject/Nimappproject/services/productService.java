package com.NimappProject.Nimappproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.NimappProject.Exception.ResourceNotFoundException;
import com.NimappProject.Nimappproject.Repository.categoryRepository;
import com.NimappProject.Nimappproject.Repository.productRepository;

import model.Category;
import model.Product;
import java.util.Optional;
@Service
public class productService {
	@Autowired
    private productRepository productRepository;

    @Autowired
    private categoryRepository categoryRepository;

    public Product createProduct(Product product, int categoryId) throws ResourceNotFoundException {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found with id " + categoryId));

        product.setCategory(category);

        return productRepository.save(product);
    }	
    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }
	public Page<Product> getAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
	 
	
	public Product updateProduct(int id, Product updatedProduct) {
		Product product = productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Product not found with id " + id));
        product.setProduct_name(updatedProduct.getProduct_name());
        product.setDescription(updatedProduct.getDescription());
        product.setPrice(updatedProduct.getPrice());
        product.setImageUrl(updatedProduct.getImageUrl());
        product.setStockQuantity(updatedProduct.getStockQuantity());
        product.setAvailable(updatedProduct.isAvailable());
        return productRepository.save(product);
    }

    
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }


	
}
