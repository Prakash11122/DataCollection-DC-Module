package com.prakash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.service.DataCollectionService;

@RestController
public class DataCollectionController {
	@Autowired
	DataCollectionService dataCollectionService;
	@GetMapping("/plan/{appId}")
	public Integer getCaseNumber(@PathVariable Integer appId) {
		
		return dataCollectionService.createCase(appId);
	}

}
