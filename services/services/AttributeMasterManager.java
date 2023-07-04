package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import com.bookworm.entities.AttributeMaster;

public interface AttributeMasterManager {
	void addAttributeMaster(AttributeMaster a);
	List<AttributeMaster> getAttributeMaster();
	void delete(int id);
	//void update(AttributeMaster attributemaster,int id);
	Optional<AttributeMaster> getAttributeMaster(int id);


}
