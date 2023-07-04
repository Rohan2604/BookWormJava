package com.bookworm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookworm.entities.MyShelf;


public interface MyShelfRepository extends JpaRepository<MyShelf,Integer>{

}
