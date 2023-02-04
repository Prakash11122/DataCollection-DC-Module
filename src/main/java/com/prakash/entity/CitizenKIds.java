package com.prakash.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Kid_Details")
@Data
public class CitizenKIds {
	
	@Id
	private Integer Kidid;
	private Integer Case_Id;
	private String kname;
	private Integer kage;
	private Integer kssn;
	

}
