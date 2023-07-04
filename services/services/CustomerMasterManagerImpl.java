package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entities.CustomerMaster;
import com.bookworm.repositories.CustomerMasterRepository;

@Service
public class CustomerMasterManagerImpl implements CustomerMasterManager {
	@Autowired
	CustomerMasterRepository repository;

	@Override
	public void addCustomerMaster(CustomerMaster p) {
		repository.save(p);
		
		
	}

	@Override
	public List<CustomerMaster> getCustomerMasters() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}


	@Override
	public Optional<CustomerMaster> getCustomerMaster(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}

