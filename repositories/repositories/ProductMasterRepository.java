package com.bookworm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookworm.entities.ProductMaster;


public interface ProductMasterRepository extends JpaRepository<ProductMaster,Integer>{

}
