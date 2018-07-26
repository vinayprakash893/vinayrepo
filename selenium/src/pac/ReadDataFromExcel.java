package pac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
		/*Step:1 Get the java object of the physical file */
		FileInputStream fis = new FileInputStream("Co-op Bank - Inventory File 04th April 2018_BBM v18.xls");
		/* Step2:Open Work Book in Read Mode*/
		Workbook wb=WorkbookFactory.create(fis);
		/*Step3:get the control of the sheet platform Identified */
		Sheet sh=wb.getSheet("Platform Identified");
		/*Step4:get the control of the 2 rows*/
		Row row2=sh.getRow(2);
		/*Step5:get and read the data from the 2nd,3rd cell*/
		String IPAddress=row2.getCell(2).getStringCellValue();
		String Application=row2.getCell(3).getStringCellValue();
		System.out.println(IPAddress);
		System.out.println(Application);
		wb.close();
		
		
		
	}

}
