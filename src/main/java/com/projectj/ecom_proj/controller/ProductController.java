package com.projectj.ecom_proj.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectj.ecom_proj.model.Product;
import com.projectj.ecom_proj.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
	
	ProductService service;
	
	
	public ProductController(ProductService service) {
		super();
		this.service = service;
	}


	@RequestMapping("/")
	public String greet() {
		return "Hello, Welcome to the world of code";
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts(){
		return new ResponseEntity<>(service.getProducts(), HttpStatus.OK);
	}
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable int id) {
		return service.getProduct(id);
	}
}
