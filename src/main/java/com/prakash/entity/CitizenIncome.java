package com.prakash.entity;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Income_Details")
@Data
public class CitizenIncome {
	@Id
	private Integer IncomeId;
	private Integer Case_Id;
	private Double MonthlySal;
	private Double Rent;
	private Double Property;

}
