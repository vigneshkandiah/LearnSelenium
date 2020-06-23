package week3.Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Keyboard;

public class Erail {
	
	public static void main(String[] args) throws InterruptedException {
		// to set the path for driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		//to open chrome driver
		ChromeDriver driver= new ChromeDriver();
		//to open the web
		driver.get("https://erail.in/");
		//to maximize window
		driver.manage().window().maximize();
		
		//timeouts
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("chkSelectDateOnly").click();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("Chennai",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("Delhi",Keys.ENTER);
		Thread.sleep(3000);
		
		Set<String> getTrainsFromList = new HashSet<String>();
		List<WebElement> trainNames = driver.findElementsByXPath("//td[@style=';']");
		int listSize = trainNames.size();
		System.out.println("The Train Names Printed By List :");
		for (WebElement eachTrains : trainNames) {
			
			System.out.println(eachTrains.getText().toString());
			getTrainsFromList.add(eachTrains.getText().toString());
		}
		System.out.println("*******************************************************");
		
		
		
		for (String eachSetTrians : getTrainsFromList) {
			
			System.out.println(eachSetTrians.toString());
			
		}
		int setSize = getTrainsFromList.size();
		
		System.out.println();
		if(listSize==setSize) {
			System.out.println("The Names are Unique");
		}else {
			System.out.println("The Names are Not Unique");
		}
		
		
		
	}

}
