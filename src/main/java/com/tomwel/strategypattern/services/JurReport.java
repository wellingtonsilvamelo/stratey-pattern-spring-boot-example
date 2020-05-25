package com.tomwel.strategypattern.services;

import com.tomwel.strategypattern.models.enums.ReportType;

public interface JurReport {
	void generateReport();
	ReportType getReportName();
}
