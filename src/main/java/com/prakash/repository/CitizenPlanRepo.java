package com.prakash.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakash.entity.CitizenPlan;

public interface CitizenPlanRepo extends JpaRepository<CitizenPlan, Serializable> {

}
