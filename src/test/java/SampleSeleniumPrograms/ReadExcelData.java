package SampleSeleniumPrograms;

import cts.miniproject.utility.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {

		ExcelDataConfig excel=new ExcelDataConfig("K:\\\\Eclipse\\\\SampleSele\\\\src\\\\test\\\\resources\\\\Excelsheets\\\\TestData.xlsx");
		System.out.println(excel.getData(0, 0, 0));
		System.out.println(excel.getData(0, 0, 1));
	}

}
