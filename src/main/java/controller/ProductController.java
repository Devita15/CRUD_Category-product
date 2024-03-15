package controller;

import java.util.List;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import model.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	private com.NimappProject.Nimappproject.services.productService productService;
	@PostMapping("/create")
	@ResponseBody
    public ResponseEntity<Product> createProduct(@RequestBody Product product, @RequestParam("Id") int categoryId) throws AttributeNotFoundException {
        Product createdProduct = productService.createProduct(product, categoryId);
        return ResponseEntity.ok(createdProduct);
    }
	 @GetMapping("/{id}")
	    public ResponseEntity<Product> getProductById(@PathVariable int id) {
	        Product product = productService.getProductById(id)
	                .orElseThrow(() -> new RuntimeException("Product not found with id " + id));
	        return ResponseEntity.ok(product);
	    }
	 @GetMapping
	    public ResponseEntity<Page<Product>> getAllProducts(Pageable pageable) {
	        Page<Product> products = productService.getAllProducts(pageable);
	        return ResponseEntity.ok(products);
	    }

	 @PutMapping("/{id}")
	    public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product product) {
	        Product updatedProduct = productService.updateProduct(id, product);
	        return ResponseEntity.ok(updatedProduct);
	    }

	    
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
	        productService.deleteProduct(id);
	        return ResponseEntity.noContent().build();
	    }
	
}