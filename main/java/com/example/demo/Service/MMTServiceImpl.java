package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Entity.MMtTkt;

@Service
public class MMTServiceImpl implements MMTservice  {

	@Autowired
    RestTemplate restTemplate;

	@Override
	public ResponseEntity CollectToBookTkt(MMtTkt mMtTkt) {
		// TODO Auto-generated method stub
		ResponseEntity responseEntity=restTemplate.postForEntity("http://localhost:8080", mMtTkt,String.class);
		return responseEntity;
	}

	@Override
	public ResponseEntity CollectTogetTicket(Integer tid) {
		// TODO Auto-generated method stub
		ResponseEntity response=restTemplate.getForEntity("http://localhost:8080/ticket"+tid, String.class);
		return response;
	}

}
