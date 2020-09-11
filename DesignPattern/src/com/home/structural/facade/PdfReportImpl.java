package com.home.structural.facade;

import java.sql.Connection;

public class PdfReportImpl implements PdfReport {

	@Override
	public void generatePdfReport(Connection connection, String tableName) {
		System.out.println("Pdf report generated successfully!!!");
	}

}
