package com.bookworm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookworm.entities.InvoiceDetails;


public interface InvoiceDetailRepository extends JpaRepository<InvoiceDetails,Integer>{

}
