package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import com.bookworm.entities.MyShelf;

public interface MyShelfManager {
	void addMyShelf(MyShelf p);
	List<MyShelf> getMyShelfs();
	void delete(int id);
	Optional<MyShelf> getMyShelf(int id);

}
