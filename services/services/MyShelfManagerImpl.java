package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entities.MyShelf;
import com.bookworm.repositories.MyShelfRepository;

@Service
public class MyShelfManagerImpl implements MyShelfManager {
	@Autowired
	MyShelfRepository repository;

	@Override
	public void addMyShelf(MyShelf p) {
		repository.save(p);
		
		
	}

	@Override
	public List<MyShelf> getMyShelfs() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}


	@Override
	public Optional<MyShelf> getMyShelf(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}
