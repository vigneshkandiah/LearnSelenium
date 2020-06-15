package week2.Homework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Lead {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[contains(@class,'deco')]").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		driver.findElementByXPath("(//a[contains(text(),'Lead')])[1]").click();
		driver.findElementByXPath("//a[contains(text(),'Create')]").click();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("FirstData");
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Vignesh");
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("Kandiah");
		
		Select dropDownSource = new Select(driver.findElementByName("dataSourceId"));
		dropDownSource.selectByValue("LEAD_EMPLOYEE");
		driver.findElementByXPath("//input[contains(@name,'annual')]").sendKeys("1250000");
		
		Select dropDownIndustry= new Select(driver.findElementByName("industryEnumId"));
		dropDownIndustry.selectByValue("IND_SOFTWARE");
		
		Select dropDownOwnership =new Select(driver.findElementByName("ownershipEnumId"));
		dropDownOwnership.selectByVisibleText("S-Corporation");
		
		driver.findElementByXPath("//textarea[@name='description']").sendKeys("Selenium Automation Tester");
		
		Select dropDownMarket= new Select(driver.findElementByName("marketingCampaignId"));
		dropDownMarket.selectByIndex(5);
		
		Select dropDownSTP= new Select(driver.findElementByName("generalStateProvinceGeoId"));
		dropDownSTP.selectByValue("TX");
		
		driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("vigneshkandiah@gmail.com");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("9008796634");
		
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		
	}
	

}
	

