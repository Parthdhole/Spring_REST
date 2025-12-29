package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Entity.MMtTkt;
import com.example.demo.Service.MMTServiceImpl;
import com.example.demo.Service.MMTservice;

import jakarta.annotation.PostConstruct;

@RestController

public class MMTController {

   
	
	@Autowired
	MMTServiceImpl mmTservice;

   
	
	@GetMapping("mmt/ticket/{id}")
	ResponseEntity getTktByid(@PathVariable int tid) {
		ResponseEntity  r= mmTservice.CollectTogetTicket(tid);
		return r;
	}
	
	@PostMapping("mmt/ticket")
	ResponseEntity bookmmticket(@RequestBody MMtTkt mmTkt) {
		ResponseEntity  res= mmTservice.CollectToBookTkt(mmTkt);
		return res;
	}
	
	
	
	

}
