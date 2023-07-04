package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entities.RoyaltyCalculation;
import com.bookworm.repositories.RoyaltyCalculationRepository;

@Service
public class RoyaltyCalculationManagerImpl implements RoyaltyCalculationManager {
	@Autowired
	RoyaltyCalculationRepository repository;

	@Override
	public void addRoyaltyCalculation(RoyaltyCalculation p) {
		repository.save(p);
		
		
	}

	@Override
	public List<RoyaltyCalculation> getRoyaltyCalculations() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}


	@Override
	public Optional<RoyaltyCalculation> getRoyaltyCalculation(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}
