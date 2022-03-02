package com.adrian.spring.sqljwt.app.models.dao.data;

import org.springframework.data.repository.CrudRepository;

import com.adrian.spring.sqljwt.app.models.entity.data.Product;

public interface IProductDao extends CrudRepository<Product, Long> {

}
