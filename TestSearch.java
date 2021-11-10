package cleartrip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSearch extends TestBase
{
  @Test(dataProvider="getData")
  public void testsearch(String From, String To, String isLastRow) throws Exception{
	 
	  PageElements pe=new PageElements(driver);
	  
	  pe.SetSearchFrom(From);
	  Thread.sleep(1500);
	  
	  pe.SelectFromCity();
	  pe.SetSearchTo(To);
	  Thread.sleep(1500);
	  pe.SelectToCity();
	  
	  if(isLastRow == "true") {
		  pe.SelectDepartOn();
		  Thread.sleep(1500);
		  pe.SelectDepartOnDate();
		  Thread.sleep(1500);
		  pe.SelectAdults();
		  Thread.sleep(1500);
		  pe.SelectAdultsCount();
		  Thread.sleep(1500);
		  pe.SelectChildren();
		  Thread.sleep(1500);
		  pe.SelectChildrenCount();
		  Thread.sleep(1500);
		  pe.SelectInfants();
		  Thread.sleep(1500);
		  pe.SelectInfantscount();
		  Thread.sleep(1500);
	  pe.SubmitSearchFlights();
	  }
  } 
  @DataProvider
	public String[][] getData() throws IOException {
		
	   File srcFile=new File("C:\\Users\\ravik\\Downloads\\Book (1).xlsx");
		FileInputStream fis=new FileInputStream(srcFile);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		//reading multiple set of data
		
		int rct=ws.getLastRowNum();
		String[][] citydata= new String[6][3];
		for(int i=1;i<=rct;i++)
		{
			citydata[i-1][0]=ws.getRow(i).getCell(0).getStringCellValue();
			citydata[i-1][1]=ws.getRow(i).getCell(1).getStringCellValue();
			
			if(i == rct)
				citydata[i-1][2] = "true";
			else
				citydata[i-1][2] = "false";
			
		}
		return citydata;
	       
  }
}