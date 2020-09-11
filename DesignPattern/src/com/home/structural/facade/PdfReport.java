package com.home.structural.facade;

import java.sql.Connection;

public interface PdfReport {

	public abstract void generatePdfReport(Connection connection,String tableName);
}
