package com.bookworm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entities.ProductMaster;
import com.bookworm.services.ProductMasterManager;

@RestController
//@CrossOrigin("https://localhost:3000")
public class ProductMasterController {
	@Autowired
	private ProductMasterManager manager;
	
	@GetMapping(value = "/api/ProductMasters")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public List<ProductMaster> showProducts()
	 {
		  return manager.getProducts();
	 }
	
	@GetMapping(value = "/api/ProductMastersByType/{typeId}")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public List<ProductMaster> showProductsByType(@PathVariable int typeId)
	{
		  return manager.listByType(typeId); 
	}
	
	@GetMapping(value = "/api/ProductMastersByGenere/{genereId}")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public List<ProductMaster> showProductsByGenere(@PathVariable int genereId)
	{
		  return manager.listByGenere(genereId); 	
	}

//	@GetMapping(value = "/api/ProductMastersInShelf/{custId}")
//	@CrossOrigin(origins = "", allowedHeaders = "")
//	public List<ProductMaster> showProductsInShelf(@PathVariable int custId)
//	{
//		  return manager.listInShelf(custId);
//	}
	
	@GetMapping(value = "/api/ProductMastersById/{pid}")
	 @CrossOrigin(origins = "*", allowedHeaders = "*")
	 public Optional<ProductMaster> getProduct(@PathVariable int pid)
	 {
		
		return manager.getProduct(pid); 
	 }
	
	@PostMapping(value = "/api/ProductMasters")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	 public void addProduct(@RequestBody ProductMaster p)
	 {
		manager.addProduct(p);
	 }
	
	@DeleteMapping(value = "/api/ProductMasters/{pid}")
	@CrossOrigin(origins = "", allowedHeaders = "")
	 public void removeProduct(@PathVariable int pid)
	 {
		manager.delete(pid);
	 }
}