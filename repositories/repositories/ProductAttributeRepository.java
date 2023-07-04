package com.bookworm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookworm.entities.ProductAttribute;


public interface ProductAttributeRepository extends JpaRepository<ProductAttribute,Integer>{

}
