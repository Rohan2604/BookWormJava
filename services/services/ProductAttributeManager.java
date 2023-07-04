package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import com.bookworm.entities.ProductAttribute;

public interface ProductAttributeManager {
	void addProductAttribute(ProductAttribute p);
	List<ProductAttribute> getProductAttributes();
	void delete(int id);
	Optional<ProductAttribute> getProductAttribute(int id);

}
/*package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface ProductAttributeManager
{
	void addProductAttribute(ProductAttribute p);
	List<ProductAttribute> getProductAttributes();
	void delete(int id);
	Optional<ProductAttribute> getProductAttribute(int id);
}
*/