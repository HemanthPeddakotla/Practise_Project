package generic_utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadData {

	// To Read data from excel
	public static String[][] fromExcel(String sheetName) throws Exception   {
		File file = new File("./src/test/resources/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet dataSheet = workbook.getSheet(sheetName);
		int rowCount = dataSheet.getPhysicalNumberOfRows()-1;
		int colCount = dataSheet.getRow(0).getPhysicalNumberOfCells()-1;
		
		String [][]data = new String[rowCount][colCount];
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				data[i][j] = dataSheet.getRow(i+1).getCell(j+1).toString();
			}
		}
		return data;
	}
	
	
	//To Read data from property file
	public static String fromProperty(String key) throws Exception {
		File file = new File("./src/test/resources/Configuration.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties property = new Properties();
		property.load(fis);
		return property.getProperty(key).toString();	
	}

}
