package com.prakash.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Education_Details")
public class CitizenEducation {
	
	@Id
	private Integer educationId;
	private Integer Case_Id;
	private String highestDegre;
	private String graduationYear;
	private String univercityName;
	
	
	

}
