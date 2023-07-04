package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entities.GenereMaster;
import com.bookworm.repositories.GenereMasterRepository;

@Service
public class GenereMasterManagerImpl implements GenereMasterManager {
	@Autowired
	GenereMasterRepository repository;

	@Override
	public void addGenereMaster(GenereMaster p) {
		repository.save(p);
		
		
	}

	@Override
	public List<GenereMaster> getGenereMasters() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}


	@Override
	public Optional<GenereMaster> getGenereMaster(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}


}
