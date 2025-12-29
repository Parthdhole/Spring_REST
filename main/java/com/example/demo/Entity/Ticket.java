package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer tid;
	private Integer prn;
	private String dest;
	private String source;
	private Integer seatNo;

}
