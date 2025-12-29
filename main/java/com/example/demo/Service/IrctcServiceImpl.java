package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Ticket;
import com.example.demo.Repositoryirctc.IrctcRepo;

@Service
public class IrctcServiceImpl implements IrctcService {
 
	@Autowired
	IrctcRepo irctcRepo;
	
	@Override
	public int saveTicket(Ticket ticket) {
		Ticket BookTicket= irctcRepo.save(ticket);
		return BookTicket.getTid();
		
		
	}

	@Override
	public Ticket getTicket(int tid) {
		// TODO Auto-generated method stub
	   return irctcRepo.findById(tid).get();
	}

}
