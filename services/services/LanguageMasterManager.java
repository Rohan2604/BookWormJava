package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import com.bookworm.entities.LanguageMaster;

public interface LanguageMasterManager {
	void addLanguageMaster(LanguageMaster p);
	List<LanguageMaster> getLanguageMasters();
	void delete(int id);
	Optional<LanguageMaster> getLanguageMaster(int id);

}
