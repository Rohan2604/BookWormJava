package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entities.InvoiceDetails;
import com.bookworm.repositories.InvoiceDetailRepository;

@Service
public class InvoiceDetailsManagerImpl implements InvoiceDetailsManager {
	@Autowired
	InvoiceDetailRepository repository;

	@Override
	public void addInvoiceDetails(InvoiceDetails p) {
		repository.save(p);
		
		
	}

	@Override
	public List<InvoiceDetails> getInvoiceDetails() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}


	@Override
	public Optional<InvoiceDetails> getInvoiceDetails(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}

