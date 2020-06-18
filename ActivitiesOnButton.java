package week2.LeafTapAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivitiesOnButton {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		//Activity 2 : Find position of button (x,y)
		
		
		
		Point location = driver.findElementByXPath("//button[contains(text(),'Ge')]").getLocation();
		
		System.out.println("The position of button (x,y) :"+ location);
		
		//Activity 3 : Find button color
		
		String cssValue = driver.findElementByXPath("//button[contains(text(),'color')]").getCssValue("background-color");
		System.out.println("Button color is :"+cssValue);
		
		//Activity 4 : Find the height and width
		
		Dimension size = driver.findElementByXPath("//button[contains(text(),'size')]").getSize();
		
		System.out.println("The height and width of the button is :"+size);
		
		
		//Activity 1 : Click button to travel home page
		
				driver.findElementByXPath("//button[contains(text(),'Go')]").click();
	}

}
