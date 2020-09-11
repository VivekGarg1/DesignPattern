package com.home.structural.facade;

import java.sql.Connection;

public interface ExcelReport {

	public abstract void generateExcelReport(Connection connection,String tableName);
}
