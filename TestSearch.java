package cleartrip;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSearch extends TestBase
{
  @Test(dataProvider="getData")
  public void testsearch(String From, String To) throws Exception{
	 
	  PageElements pe=new PageElements(driver);
	  
	  pe.SetSearchFrom("hyd");
	  Thread.sleep(1500);
	  
	  pe.SelectFromCity();
	  pe.SetSearchTo("blr");
	  Thread.sleep(1500);
	  pe.SelectToCity();
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
  @DataProvider
	public String[][] getData() throws IOException {
		
	  // return page method
		String xFile="Downloads\\Book.xlsx";
		String xSheet="Sheet1";
		
		int rowCount = excelUtility.getRowCount(xFile, xSheet);
		int cellCount = excelUtility.getCellCount(xFile, xSheet, rowCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1; i<=rowCount; i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j] = excelUtility.getCellData(xFile, xSheet, i, j);
			}
		}
		return data;
	}
}