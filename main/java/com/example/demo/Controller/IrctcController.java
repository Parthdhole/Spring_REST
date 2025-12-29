package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Ticket;
import com.example.demo.Service.IrctcService;

@RestController
public class IrctcController {

	
	@Autowired
	IrctcService irctcService;
	
	@PostMapping("ticket")
	public String saveTicket(@RequestBody Ticket ticket) {
		
	int tkid=	irctcService.saveTicket(ticket);
		return "Ticket Book Sccuccessfully and ticket id is  "+tkid;
		
	}
	
	@GetMapping("ticket/{id}")
public Ticket TicktTicket(@PathVariable int tid) {
		
		return irctcService.getTicket(tid);
		
		
	}
	
	
}
