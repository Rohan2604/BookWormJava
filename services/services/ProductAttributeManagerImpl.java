package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entities.ProductAttribute;
import com.bookworm.repositories.ProductAttributeRepository;

@Service
public class ProductAttributeManagerImpl implements ProductAttributeManager {
	@Autowired
	ProductAttributeRepository repository;

	@Override
	public void addProductAttribute(ProductAttribute p) {
		repository.save(p);
		
		
	}

	@Override
	public List<ProductAttribute> getProductAttributes() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}


	@Override
	public Optional<ProductAttribute> getProductAttribute(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}
