package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import com.bookworm.entities.CustomerMaster;

public interface CustomerMasterManager {
	void addCustomerMaster(CustomerMaster c);
	List<CustomerMaster> getCustomerMasters();
	void delete(int id);
	Optional<CustomerMaster> getCustomerMaster(int id);
	
	

}
