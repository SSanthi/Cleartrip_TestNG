package cleartrip;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageElements
{
	 private WebDriver driver;
	 
	public PageElements(WebDriver driver) 
    {
        this.driver = driver;
    	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div/input")
	WebElement SearchFrom;
	public void SetSearchFrom(String city)
    {
    	SearchFrom.sendKeys(city);
    }
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[5]/div/div/div/input")
	WebElement SearchTo;
	public void SetSearchTo(String city)
	{
		SearchTo.sendKeys(city);
	}

	@FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div[2]/ul/li/p")
    List<WebElement> FromSuggestions;
	
	public void SelectFromCity()
	{
		
		if(FromSuggestions.size()>=1)
		{
			FromSuggestions.get(0).click();
		}
	}
	
	@FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[5]/div/div/div[2]/ul/li/p")
	List<WebElement> ToSuggestions;
	public void SelectToCity()
	{
		
		if(ToSuggestions.size()>=1)
		{
			ToSuggestions.get(0).click();
		}
	}
	
	@FindBy(xpath="//*[@id='root']/div/div/div[1]/div/div[2]/div/div[7]/div[2]/button")
	WebElement SearchFlights;
	public void SubmitSearchFlights()
	{
		SearchFlights.click();
	}
	
	@FindBy(xpath="//*[@id='root']/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/button")
	WebElement DepartOn;
	public void SelectDepartOn()
	{
		DepartOn.click();
	}
	@FindBy(xpath="//*[@id='root']/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div/ul/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[7]/div/div")
	WebElement DepartOnDate;
	public void SelectDepartOnDate()
	{
		DepartOnDate.click();
	}
	@FindBy(xpath="//*[@id='root']/div/div/div[1]/div/div[2]/div/div[4]/div/div[1]/select")
	WebElement Adults;
	public void SelectAdults()
	{
		Adults.click();
	}
	@FindBy(xpath="//*[@id='root']/div/div/div[1]/div/div[2]/div/div[4]/div/div[1]/select/option[2]")
	WebElement AdultsCount;
	public void SelectAdultsCount()
	{
		AdultsCount.click();
	}
	@FindBy(xpath="//*[@id='root']/div/div/div[1]/div[1]/div[2]/div/div[4]/div/div[3]/select")
	WebElement Children;
	public void SelectChildren()
	{
		Children.click();	
	}
	@FindBy(xpath="//*[@id='root']/div/div/div[1]/div[1]/div[2]/div/div[4]/div/div[3]/select/option[2]")
	WebElement ChildrenCount;
	public void SelectChildrenCount()
	{
		ChildrenCount.click();	
	}
	@FindBy(xpath="//*[@id='root']/div/div/div[1]/div[1]/div[2]/div/div[4]/div/div[5]/select")
	WebElement Infants;
	public void SelectInfants()
	{
		Infants.click();	
	}
	@FindBy(xpath="//*[@id='root']/div/div/div[1]/div[1]/div[2]/div/div[4]/div/div[5]/select/option[2]")
	WebElement Infantscount;
	public void SelectInfantscount()
	{
		Infantscount.click();	
	}
}

