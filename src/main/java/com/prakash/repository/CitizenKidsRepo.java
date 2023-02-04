package com.prakash.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakash.entity.CitizenKIds;

public interface CitizenKidsRepo extends JpaRepository<CitizenKIds, Serializable> {

}
