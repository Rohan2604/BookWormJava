package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import com.bookworm.entities.InvoiceMaster;

public interface InvoiceMasterManager {
	void addInvoiceMaster(InvoiceMaster p);
	List<InvoiceMaster> getInvoiceMasters();
	void delete(int id);
	Optional<InvoiceMaster> getInvoiceMaster(int id);

}
