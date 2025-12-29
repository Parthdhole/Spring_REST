package com.example.demo.Service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.MMtTkt;


public interface MMTservice {
	
public ResponseEntity CollectToBookTkt(MMtTkt mMtTkt);

public ResponseEntity  CollectTogetTicket(Integer tid);

}
