package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import com.bookworm.entities.ProductBenMaster;

public interface ProductBenMasterManager {
	void addProductBenMaster(ProductBenMaster p);
	List<ProductBenMaster> getProductBenMasters();
	void delete(int id);
	Optional<ProductBenMaster> getProductBenMaster(int id);

}
