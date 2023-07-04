package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import com.bookworm.entities.InvoiceDetails;

public interface InvoiceDetailsManager {
	void addInvoiceDetails(InvoiceDetails d);
	List<InvoiceDetails> getInvoiceDetails();
	void delete(int id);
	Optional<InvoiceDetails> getInvoiceDetails(int id);

}
