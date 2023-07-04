package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.entities.BeneficiaryMaster;
import com.bookworm.repositories.BeneficiaryMasterRepository;

@Service
public class BeneficiaryMasterManagerImpl implements BeneficiaryMasterManager  {
	@Autowired
	BeneficiaryMasterRepository repository;

	@Override
	public void addBeneficiaryMaster(BeneficiaryMaster b) {
		repository.save(b);
		
		
	}

	@Override
	public List<BeneficiaryMaster> getBeneficiaryMaster() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}


	@Override
	public Optional<BeneficiaryMaster> getBeneficiaryMaster(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}
