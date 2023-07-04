package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entities.LanguageMaster;
import com.bookworm.repositories.LanguageMasterRepository;

@Service
public class LanguageMasterManagerImpl implements LanguageMasterManager {
	@Autowired
	LanguageMasterRepository repository;

	@Override
	public void addLanguageMaster(LanguageMaster p) {
		repository.save(p);
		
		
	}

	@Override
	public List<LanguageMaster> getLanguageMasters() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}


	@Override
	public Optional<LanguageMaster> getLanguageMaster(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	

}
