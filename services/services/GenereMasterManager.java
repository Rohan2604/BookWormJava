package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import com.bookworm.entities.GenereMaster;

public interface GenereMasterManager {
	void addGenereMaster(GenereMaster g);
	List<GenereMaster> getGenereMasters();
	void delete(int id);
	Optional<GenereMaster> getGenereMaster(int id);
}
