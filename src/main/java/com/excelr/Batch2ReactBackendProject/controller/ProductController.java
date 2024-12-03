package com.excelr.Batch2ReactBackendProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.excelr.Batch2ReactBackendProject.entity.Product;
import com.excelr.Batch2ReactBackendProject.service.ProductService;

@Controller
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
	public String addProduct(@ModelAttribute Product product)
	{
		productService.addProduct(product);
		return "Product-Added-Successfully";
	}
}
