package week2.LeafTapAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivitiesOnCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		//Activity 1:Select the languages that you know?
		WebElement language1 = driver.findElementByXPath("(//input[@type='checkbox'])[1]");
		language1.click();

		driver.findElementByXPath("(//input[@type='checkbox'])[3]").click();

		//Activity 2:Confirm Selenium is checked

		boolean selected = driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected();
		if(selected==true)  {
			System.out.println("The CheckBox Selenium is Selected");
		}else {
			System.out.println("The CheckBox Selenium is Not Selected");
		}
		//Activity 3: DeSelect only checked

		boolean CheckBoxSelected1 = driver.findElementByXPath("(//input[@type='checkbox'])[7]").isSelected();
		boolean CheckBoxSelected2 = driver.findElementByXPath("(//input[@type='checkbox'])[8]").isSelected();
		
		if(CheckBoxSelected1==true) {
			
			driver.findElementByXPath("(//input[@type='checkbox'])[7]").click();
			
			
			
		}else {
			System.out.println("The Checkbox Not selected is not Checked ");
		}
		
		if (CheckBoxSelected2==true) {
			
			driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
			
			System.out.println("The CheckBox I am Selected is Checked and Now De-Selected using the Click option ");
			
		}else {
			
			System.out.println("The I am Selected is not Checked ");
			
		}
		//Activity 4: Select all below checkboxes		

		driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[10]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[12]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[13]").click();
	}

}
