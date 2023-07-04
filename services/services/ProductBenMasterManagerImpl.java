package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entities.ProductBenMaster;
import com.bookworm.repositories.ProducteBenMasterRepository;
//import com.bookworm.entities.ProductBenMaster;

@Service
public class ProductBenMasterManagerImpl implements ProductBenMasterManager {

	@Autowired
	ProducteBenMasterRepository repository;

	@Override
	public void addProductBenMaster(ProductBenMaster p) {
		repository.save(p);
		
		
	}

	@Override
	public List<ProductBenMaster> getProductBenMasters() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}


	@Override
	public Optional<ProductBenMaster> getProductBenMaster(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}
