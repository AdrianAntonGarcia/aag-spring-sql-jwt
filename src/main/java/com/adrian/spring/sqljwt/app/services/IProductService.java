package com.adrian.spring.sqljwt.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adrian.spring.sqljwt.app.models.entity.data.Product;

@Service
public interface IProductService {
	public List<Product> getProducts();
}
