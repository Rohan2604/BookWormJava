package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import com.bookworm.entities.ProductTypeMaster;

public interface ProductTypeMasterManager {
	void addProductTypeMaster(ProductTypeMaster p);
	List<ProductTypeMaster> getProductTypeMasters();
	void delete(int id);
	Optional<ProductTypeMaster> getProductTypeMaster(int id);

}
