package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import com.bookworm.entities.RoyaltyCalculation;

public interface RoyaltyCalculationManager {
	void addRoyaltyCalculation(RoyaltyCalculation p);
	List<RoyaltyCalculation> getRoyaltyCalculations();
	void delete(int id);
	Optional<RoyaltyCalculation> getRoyaltyCalculation(int id);

}
