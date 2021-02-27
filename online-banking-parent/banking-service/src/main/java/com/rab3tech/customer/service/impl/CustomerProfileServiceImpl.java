
  package com.rab3tech.customer.service.impl;
  
  import java.util.ArrayList; import java.util.List; import java.util.Optional;
  
  import org.springframework.beans.BeanUtils; import
  org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Service;

import com.rab3tech.customer.dao.repository.CustomerRepository;
import com.rab3tech.customer.service.CustomerProfileService;
import com.rab3tech.dao.entity.Customer;
 
  
  @Service public class CustomerProfileServiceImpl implements CustomerProfileService {
  
  @Autowired private CustomerRepository customerRepository;
  
 
  
  
  
  

	@Override
		public Customer customerProfile(String email) {
			Optional<Customer> optional = customerRepository.findByEmail(email);
			Customer customer = optional.get();
			return customer;
  
  } }
  
  
  
  
  
  
  
  
  
  
  
 