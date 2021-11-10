package cleartrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase {
	  WebDriver driver;
      @Parameters("url")
	    @BeforeClass
	    public void beforeClass(String url)
	    {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravik\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get(url);
	        driver.manage().window().maximize();
	    }

	    @AfterClass
	    public void afterClass()
	    {
	       // driver.quit();
	        
	    }

}
