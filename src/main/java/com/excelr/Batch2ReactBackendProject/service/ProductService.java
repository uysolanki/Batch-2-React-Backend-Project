package com.excelr.Batch2ReactBackendProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.Batch2ReactBackendProject.entity.Product;
import com.excelr.Batch2ReactBackendProject.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepo;
	
	public Product addProduct(Product product) {
		return productRepo.save(product);
		
	}

	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

}
