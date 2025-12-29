package com.example.demo.Repositoryirctc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Ticket;

@Repository
public interface IrctcRepo extends JpaRepository<Ticket, Integer>  {

}
