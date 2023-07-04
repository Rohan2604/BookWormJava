package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entities.ProductTypeMaster;
import com.bookworm.repositories.ProductTypeMasterRepository;

@Service
public class ProductTypeMasterManagerImpl implements ProductTypeMasterManager {
	@Autowired
	ProductTypeMasterRepository repository;

	@Override
	public void addProductTypeMaster(ProductTypeMaster p) {
		repository.save(p);
		
		
	}

	@Override
	public List<ProductTypeMaster> getProductTypeMasters() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}


	@Override
	public Optional<ProductTypeMaster> getProductTypeMaster(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}


}
