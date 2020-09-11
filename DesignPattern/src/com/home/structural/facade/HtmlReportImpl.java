package com.home.structural.facade;

import java.sql.Connection;

public class HtmlReportImpl implements HtmlReport {

	@Override
	public void generateHtmlReport(Connection connection, String tableName) {
		System.out.println("Html report generated successfully!!!");
	}

}
