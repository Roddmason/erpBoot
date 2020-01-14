package com.elitsoft.erp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elitsoft.erp.model.bean.LoginBean;

@Repository
public interface LoginRepository extends CrudRepository<LoginBean, String>{
	  
}