package com.projectj.ecom_proj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projectj.ecom_proj.model.Product;
import com.projectj.ecom_proj.repo.ProductRepo;

@Service
public class ProductService {

	ProductRepo repo;

	public ProductService(ProductRepo repo) {
		super();
		this.repo = repo;
	}

	public List<Product> getProducts() {
		return repo.findAll();
	}

	public Product getProduct(int id) {
		return repo.findById(id).orElse(new Product());
	}
	
	
}
