package com.adrian.spring.sqljwt.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adrian.spring.sqljwt.app.models.dao.data.IProductDao;
import com.adrian.spring.sqljwt.app.models.entity.data.Product;

@Service
public class ProductService implements IProductService {

	@Autowired
	private IProductDao productDao;

	@Override
	@Transactional(readOnly = true)
	public List<Product> getProducts() {
		return (List<Product>) productDao.findAll();
	}

}
