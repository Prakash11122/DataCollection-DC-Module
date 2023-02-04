package com.prakash.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakash.entity.CitizenEducation;

public interface CitizenEducationRepo extends JpaRepository<CitizenEducation, Serializable> {

}
