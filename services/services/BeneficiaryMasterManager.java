package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import com.bookworm.entities.BeneficiaryMaster;

public interface BeneficiaryMasterManager {
	void addBeneficiaryMaster(BeneficiaryMaster b);
	List<BeneficiaryMaster> getBeneficiaryMaster();
	void delete(int id);
	Optional<BeneficiaryMaster> getBeneficiaryMaster(int id);

}
