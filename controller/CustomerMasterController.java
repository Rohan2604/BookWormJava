//package com.bookworm.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.bookworm.services.CustomerMasterManager;
//import com.bookworm.entities.CustomerMaster;
//import com.bookworm.entities.LoginRequest;
//
//@RestController
////@CrossOrigin("http://localhost:3000")
//public class CustomerMasterController {
//	@Autowired
//	private CustomerMasterManager manager;
//	
//	@CrossOrigin(origins = "*",allowedHeaders="*")
//	@GetMapping(value = "api/CustomerMasters")
//	 public List<CustomerMaster> showCustomerMasters()
//	 {
//		  return manager.getCustomerMasters(); 
//		
//	 }
//	
//	@CrossOrigin(origins = "*",allowedHeaders="*")
//	 @GetMapping(value = "api/CustomerMastersById/{cid}")
//	 public Optional<CustomerMaster> getCustomer(@PathVariable int cid)
//	 {
//		Optional<CustomerMaster> c=manager.getCustomerMaster(cid);
//		return c;
//	 }
//
//	@CrossOrigin(origins = "*",allowedHeaders="*")
//	@PostMapping(value = "api/CustomerMasters/")
//	 public void addCustomer(@RequestBody CustomerMaster c)
//	 {
//		manager.addCustomerMaster(c);
//	 }
//	
//	@CrossOrigin(origins = "*",allowedHeaders="*")
//	@DeleteMapping(value = "api/products/{cid}")
//	 public void removeCustomer(@PathVariable int cid)
//	 {
//			manager.delete(cid);
//	 }
//	
////	@CrossOrigin(origins = "*",allowedHeaders="*")
////	  @PostMapping("api/login")
////	  public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest, HttpSession session) {
////	    CustomerMaster user = manager.login(loginRequest.getEmail(), loginRequest.getPassword());
////	    session.setAttribute("user", user);
////	    return ResponseEntity.ok(user);
////	  }
////	
////	@CrossOrigin(origins = "*",allowedHeaders="*")
////	  @GetMapping("api/user")
////	  public ResponseEntity<?> getUser(HttpSession session) {
////	    CustomerMaster user = manager.getCurrentUser(session);
////	    return ResponseEntity.ok(user);
////	  }
////		@CrossOrigin(origins = "*",allowedHeaders="*")
////	  @PostMapping("/api/logout")
////	  public ResponseEntity<?> logout(HttpSession session) {
////	    session.invalidate();
////	    return ResponseEntity.ok().build();
////	  }
//	
//}

package com.bookworm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entities.CustomerMaster;
import com.bookworm.entities.LoginRequest;
import com.bookworm.services.CustomerMasterManager;


@RestController  
@CrossOrigin("http://localhost:3000/")
public class CustomerMasterController {
	@Autowired
    private CustomerMasterManager service;
	
	@GetMapping("api/Customer")
	 public List<CustomerMaster> getAllCustomers()
	 {
		   return service.getAllCustomer();
	 }
	
	@PostMapping("api/Customer")
	public void saveCustomerMaster(@RequestBody CustomerMaster ref)
	{
		   service.save(ref);
	}
	
	@PostMapping("api/Login")
	public CustomerMaster login(@RequestBody LoginRequest ref)
	{
		System.out.println(ref.getEmail()+ " " +ref.getPassword());
		   return service.validateCustomer(ref.getEmail(), ref.getPassword());
	}
}
