package com.home.client;

import java.sql.Connection;

import com.home.structural.facade.ExcelReport;
import com.home.structural.facade.ExcelReportImpl;
import com.home.structural.facade.HtmlReport;
import com.home.structural.facade.HtmlReportImpl;
import com.home.structural.facade.PdfReport;
import com.home.structural.facade.PdfReportImpl;
import com.home.structural.facade.ReportFacade;

public class FacadeClientTest {

	public static void main(String[] args) {
		Connection connection=null;
		String  tableName="report_table";
		
		//Without using facade pattern
		
		HtmlReport htmlReport=new HtmlReportImpl();
		htmlReport.generateHtmlReport(connection, tableName);
		
		PdfReport pdfReport=new PdfReportImpl();
		pdfReport.generatePdfReport(connection, tableName);
		
		ExcelReport excelReport=new ExcelReportImpl();
		excelReport.generateExcelReport(connection, tableName);
		
		System.out.println("--------------------------------------");
		
		//Using facade pattern
		
		ReportFacade reportFacade=new ReportFacade();
		reportFacade.generateExcelReport(connection, tableName);
		reportFacade.generateHtmlReport(connection, tableName);
		reportFacade.generatePdfReport(connection, tableName);
	}
}
