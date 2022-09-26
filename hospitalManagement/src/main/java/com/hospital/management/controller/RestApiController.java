package com.hospital.management.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.management.entities.RegisterUser;
import com.hospital.management.repository.RepositoryHosp;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
@RestController
public class RestApiController {

	 @Autowired
	    private RepositoryHosp repositoryHosp;
	 
	@GetMapping("/customers")
//	@RequestMapping(value="/user/alert/add",method=RequestMethod.POST)
	@ResponseBody
	public void getAllCustomers() {
		System.out.println("Get all Customers...");
	}
	
	@PostMapping("/call")
	public RegisterUser postCustomer(@Valid @RequestBody RegisterUser customer ) {
		System.out.println("post all customer....");
		return repositoryHosp.save(customer);
		
	}
}
