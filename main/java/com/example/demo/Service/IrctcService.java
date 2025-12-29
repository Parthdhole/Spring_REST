package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Ticket;


public interface IrctcService {

	
	int saveTicket(Ticket ticket);
	Ticket getTicket(int tid);
}
