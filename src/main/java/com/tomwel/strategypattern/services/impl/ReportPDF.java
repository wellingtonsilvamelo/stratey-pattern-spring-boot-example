package com.tomwel.strategypattern.services.impl;

import org.springframework.stereotype.Service;

import com.tomwel.strategypattern.models.enums.ReportType;
import com.tomwel.strategypattern.services.JurReport;

@Service
public class ReportPDF implements JurReport {

	@Override
	public void generateReport() {
		System.out.println(ReportType.PDF.toString());
	}

	@Override
	public ReportType getReportName() {
		return ReportType.PDF;
	}

}
