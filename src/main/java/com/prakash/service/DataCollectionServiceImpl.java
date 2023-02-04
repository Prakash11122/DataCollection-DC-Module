package com.prakash.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prakash.entity.Case;
import com.prakash.repository.CaseRepo;

@Service
public class DataCollectionServiceImpl implements DataCollectionService {
	@Autowired
	private CaseRepo caseRepo;

	@Override
	public Integer createCase(Integer appId) {
			Case cc = new Case();
			//cc.setCaseId(10122);
			//caseRepo.save(cc);
		Case casse=caseRepo.findById(appId).get();
		return casse.getCaseId();	
	}
	
	
	
	

}
