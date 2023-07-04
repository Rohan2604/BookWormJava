package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entities.ProductMaster;
import com.bookworm.repositories.ProductMasterRepository;

@Service
public class ProductMasterManagerImpl implements ProductMasterManager {
	@Autowired
	ProductMasterRepository repository;

	@Override
	public void addProductMaster(ProductMaster p) {
		repository.save(p);
		
		
	}

	@Override
	public List<ProductMaster> getProductMasters() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}


	@Override
	public Optional<ProductMaster> getProductMaster(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
}
