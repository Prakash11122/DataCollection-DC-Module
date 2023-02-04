package com.prakash.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prakash.entity.Case;

@Repository
public interface CaseRepo extends JpaRepository<Case, Serializable> {

}
