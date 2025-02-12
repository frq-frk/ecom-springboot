package com.projectj.ecom_proj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectj.ecom_proj.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
