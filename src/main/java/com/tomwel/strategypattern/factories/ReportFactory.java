package com.tomwel.strategypattern.factories;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.tomwel.strategypattern.models.enums.ReportType;
import com.tomwel.strategypattern.services.JurReport;

@Component
public class ReportFactory {

	private Map<ReportType, JurReport> jurReports;

	public ReportFactory(Set<JurReport> jurReportSet) {
		createReports(jurReportSet);
	}

	public JurReport findReport(ReportType reportType) {
		return jurReports.get(reportType);
	}

	private void createReports(Set<JurReport> jurReportSet) {
		jurReports = new HashMap<ReportType, JurReport>();
		jurReportSet.forEach(report -> {
			jurReports.put(report.getReportName(), report);
		});
	}

}
