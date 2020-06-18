package week2.LeafTapAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivitiesOnRadioButton {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/radio.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

  //Activity 1:Are you enjoying the classes?

    driver.findElementByXPath("(//input[@class='myradio'])[1]").click();

    


  //Activity 2:Find default selected radio button

    boolean selected = driver.findElementByXPath("(//input[@name='news'])[1]").isSelected();
    
    System.out.println("Yes i am enjoying the classes and selected the RadioButton - Yes ");
   
    
    String attributeText1 = driver.findElementByXPath("(//input[@name='news'])[2]").getAttribute("for");
    
    if(selected==true) {
    	
    	System.out.println("The Default Radio Button selected is Unchecked");
    	
    }else {
    	
    	System.out.println("The Default Radio Button selected is Checked");
    }




//Activity 3:Select your age group (Only if choice wasn't selected)

boolean thirdCheckbox = driver.findElementByXPath("(//input[@name='age'])[1]").isSelected();

boolean thirdCheckbox1 = driver.findElementByXPath("(//input[@name='age'])[2]").isSelected();
boolean thirdCheckbox2= driver.findElementByXPath("(//input[@name='age'])[3]").isSelected();

if(thirdCheckbox==true||thirdCheckbox1==true||thirdCheckbox2==true) {

System.out.println("The Age is already selected");
}else {
	driver.findElementByXPath(("//input[@name='age'])[1]")).click();
}
	}
}