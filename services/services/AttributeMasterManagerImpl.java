package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entities.AttributeMaster;
import com.bookworm.repositories.AttributeMasterRepository;
@Service
public class AttributeMasterManagerImpl implements AttributeMasterManager {
	@Autowired
	AttributeMasterRepository repository;

	@Override
	public void addAttributeMaster(AttributeMaster a) {
		repository.save(a);
	}

	@Override
	public List<AttributeMaster> getAttributeMaster() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}

	@Override
	public Optional<AttributeMaster> getAttributeMaster(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}


}
