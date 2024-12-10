package com.excelr.Batch2ReactBackendProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.Batch2ReactBackendProject.entity.Product;
import com.excelr.Batch2ReactBackendProject.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping("/addNewProductForm")
	public String addNewProductForm(Model model)
	{
		Product p=new Product();
		model.addAttribute("prod",p);
		return "add-new-product-form";
		
	}
	@PostMapping("/saveProduct")
	public Product addProduct(@RequestBody Product product)
	{
		 System.out.println("Received product: " + product);
		return productService.addProduct(product);
		//return "Product";
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}
}
