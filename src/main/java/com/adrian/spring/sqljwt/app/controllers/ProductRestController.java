package com.adrian.spring.sqljwt.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adrian.spring.sqljwt.app.models.entity.data.Product;
import com.adrian.spring.sqljwt.app.services.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

	@Autowired
	private IProductService productService;

	@GetMapping
	public List<Product> getProducts() {
		return productService.getProducts();
	}
}
