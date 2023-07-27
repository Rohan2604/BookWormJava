/*package com.bookworm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entities.CustomerMaster;
import com.bookworm.entities.LoginRequest;
import com.bookworm.services.CustomerMasterManagerImpl;

@RestController
//@RequestMapping("/api")
public class AuthController {

  @Autowired
  private CustomerMasterManagerImpl userService;
	@CrossOrigin(origins = "*",allowedHeaders="*")
  @PostMapping("/api/login")
  public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest, HttpSession session) {
    CustomerMaster user = userService.login(loginRequest.getEmail(), loginRequest.getPassword());
    session.setAttribute("user", user);
    return ResponseEntity.ok(user);
  }
	@CrossOrigin(origins = "*",allowedHeaders="*")
  @GetMapping("/api/user")
  public ResponseEntity<?> getUser(HttpSession session) {
    CustomerMaster user = userService.getCurrentUser(session);
    return ResponseEntity.ok(user);
  }
	@CrossOrigin(origins = "*",allowedHeaders="*")
  @PostMapping("/api/logout")
  public ResponseEntity<?> logout(HttpSession session) {
    session.invalidate();
    return ResponseEntity.ok().build();
  }
}
*/