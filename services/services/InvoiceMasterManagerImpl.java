package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entities.InvoiceMaster;
import com.bookworm.repositories.InvoiceMasterRepository;

@Service
public class InvoiceMasterManagerImpl implements InvoiceMasterManager {
	@Autowired
	InvoiceMasterRepository repository;

	@Override
	public void addInvoiceMaster(InvoiceMaster p) {
		repository.save(p);
		
		
	}

	@Override
	public List<InvoiceMaster> getInvoiceMasters() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}


	@Override
	public Optional<InvoiceMaster> getInvoiceMaster(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}
