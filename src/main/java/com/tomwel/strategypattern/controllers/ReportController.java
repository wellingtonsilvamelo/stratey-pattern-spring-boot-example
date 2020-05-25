package com.tomwel.strategypattern.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomwel.strategypattern.factories.ReportFactory;
import com.tomwel.strategypattern.models.enums.ReportType;

@RestController
@RequestMapping("/api")
public class ReportController {
	
	@Autowired
	private ReportFactory reportFactory;
	
	@GetMapping("/report/{reportType}")
	public ResponseEntity<?> report(@PathVariable("reportType") String reportType) {
		
		reportFactory.findReport(ReportType.valueOf(reportType)).generateReport();
		
		return ResponseEntity.ok().build();
	}
}
