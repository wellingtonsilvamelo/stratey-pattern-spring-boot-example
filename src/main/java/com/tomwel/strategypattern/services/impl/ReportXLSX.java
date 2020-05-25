package com.tomwel.strategypattern.services.impl;

import org.springframework.stereotype.Service;

import com.tomwel.strategypattern.models.enums.ReportType;
import com.tomwel.strategypattern.services.JurReport;

@Service
public class ReportXLSX implements JurReport {

	@Override
	public void generateReport() {
		System.out.println(ReportType.XLSX.toString());
	}

	@Override
	public ReportType getReportName() {
		return ReportType.XLSX;
	}

}
