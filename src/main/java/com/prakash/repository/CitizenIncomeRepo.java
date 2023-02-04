package com.prakash.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakash.entity.CitizenIncome;

public interface CitizenIncomeRepo extends JpaRepository<CitizenIncome, Serializable> {

}
