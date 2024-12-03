package com.excelr.Batch2ReactBackendProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.Batch2ReactBackendProject.entity.Product;
import com.excelr.Batch2ReactBackendProject.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepo;
	
	public void addProduct(Product product) {
		productRepo.save(product);
		
	}

}
