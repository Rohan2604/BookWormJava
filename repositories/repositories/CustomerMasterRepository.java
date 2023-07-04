package com.bookworm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookworm.entities.CustomerMaster;


public interface CustomerMasterRepository extends JpaRepository<CustomerMaster,Integer>{

}
