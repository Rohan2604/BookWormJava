package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import com.bookworm.entities.ProductMaster;

public interface ProductMasterManager {
	void addProductMaster(ProductMaster p);
	List<ProductMaster> getProductMasters();
	void delete(int id);
	Optional<ProductMaster> getProductMaster(int id);

}
