package com.asa.pooler.persistence.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.asa.pooler.persistence.entity.Customer;

@Transactional
public interface CustomerDao extends CrudRepository<Customer, Long> {

	public Customer findByUserId(String userId);
	
}
