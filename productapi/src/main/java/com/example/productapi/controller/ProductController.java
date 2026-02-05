package com.example.productapi.controller;

import com.example.productapi.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")

public class ProductController {
    // In-memory data store
    private List<Product> productList = new ArrayList<>();

    // ✅ Add a new product
    @PostMapping
    public ResponseEntity<?> addProduct(@RequestBody Product product) {

        // Input validation
        if (product.getName() == null || product.getName().trim().isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Product name is required");
        }

        if (product.getDescription() == null || product.getDescription().trim().isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Product description is required");
        }

        if (product.getPrice() <= 0) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Product price must be greater than zero");
        }

        productList.add(product);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(product);
    }

    // ✅ Get product by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable int id) {

        for (Product product : productList) {
            if (product.getId() == id) {
                return ResponseEntity.ok(product);
            }
        }

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("Product not found with id: " + id);
    }

    // ⭐ (Optional bonus) Get all products
    @GetMapping
    public List<Product> getAllProducts() {
        return productList;
    }
   
}
