package week2.Homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Edit_Lead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[contains(@class,'deco')]").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		driver.findElementByXPath("(//a[contains(text(),'Lead')])[1]").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("FirstData");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		try {
			driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		}
         
		String companyName=driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println("Company Name Before Editing :"+companyName);
		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("Transunion");
		driver.findElementByXPath("//input[@value='Update']").click();

		String updatedCompanyName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println("Company Name After Updating: "+updatedCompanyName);

		if(companyName.equals(updatedCompanyName)) {

			System.out.println("The Company Name is not Updated");
		}else {

			System.out.println("The Company Name is Updated");
		}
	}
}