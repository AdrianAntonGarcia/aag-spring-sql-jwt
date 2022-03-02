package com.adrian.spring.sqljwt.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.adrian.spring.sqljwt.app.models.entity.auth.Role;

public interface IRoleDao extends CrudRepository<Role, Long> {

}
