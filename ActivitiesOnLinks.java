package week2.LeafTapAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivitiesOnLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Activity 2 :Find where am supposed to go without clicking me?

		String attributeLink = driver.findElementByXPath("//a[contains(text(),'Find')]").getAttribute("href");

		System.out.println("I am supposed to go without clicking me to this page: "+attributeLink);


		//Activity 3:Verify am I broken?
		String attributerror = driver.findElementByXPath("//a[contains(text(),'Ver')]").getAttribute("href");


		if(attributerror.contains("error")){
			System.out.println("The Link is Broken");
		}else {
			System.out.println("The Link is Not Broken");


		}

        //Activity 1 :Go to Home Page

		driver.findElementByXPath("//a[contains(text(),'Go')]").click();

        //Activity 4: How many links are available in this page?

		List<WebElement> findElementsByTagName = driver.findElementsByTagName("a");

		System.out.println("The Links available in the pages are: ");
		for (WebElement eachElement : findElementsByTagName) {
			System.out.println(eachElement.getText());

		}

	}


}
