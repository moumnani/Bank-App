package com.rab3tech.customer.dao.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rab3tech.dao.entity.Customer;
import com.rab3tech.dao.entity.CustomerAccountInfo;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	
	/*
	 * @Query("select t from Customer t where t.userid.userid=?1")
	 * 
	 * public Optional<Customer> findByUserId1(String userId);
	 */
	
	//public List<Customer> findByUserId(String userId);
	
	public Optional<Customer> findByEmail(String email);
	
	public Optional<Customer> findByName(String name);
	
	public Optional<Customer> findByMobile(String mobile);
}




