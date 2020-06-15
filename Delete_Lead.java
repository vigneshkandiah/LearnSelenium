package week2.Homework;

import java.util.concurrent.TimeUnit;

import javax.annotation.RegEx;

import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Lead {

	public static void main(String[] args)  {
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
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("vigneshkandiah@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		try {
			driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		}

		String idNumber = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		String resultId= idNumber.replaceAll("[^0-9]", "");
		driver.findElementByXPath("//a[text()='Delete']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(resultId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String noRecordText = driver.findElementByXPath("//div[text()='No records to display']").getText();
		
		System.out.println(noRecordText);


	}
}







