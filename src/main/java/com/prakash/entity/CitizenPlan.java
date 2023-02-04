package com.prakash.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Plan_Table")
public class CitizenPlan {
	@Id
	private Integer planId;
	private Integer Case_Id;
	private String plan;

}
