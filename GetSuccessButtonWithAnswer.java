package Expleo;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetSuccessButtonWithAnswer {
	WebDriver driver;
	@Test
  public void DisplayCanvas() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Jagad\\OneDrive\\Desktop\\expleoTest\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	  driver.get("https://the-internet.herokuapp.com/challenging_dom");
	  System.out.println(driver.findElement(By.xpath("//a[@class = 'button success']")).getText());
	 	   
	    String answer = new String();
	    
	    ArrayList<WebElement> scripts = new ArrayList<WebElement>((ArrayList<WebElement>) driver.findElements(By.tagName("script")));
	   	   
	    
	    for(int i = 0; i < scripts.size(); i++) {
	        
	        String focusText = scripts.get(i).getAttribute("innerHTML");
	        
	        if(focusText.contains("canvas.strokeText")) {
	 
	           answer = focusText.substring(focusText.indexOf("Answer"), focusText.indexOf("',"));	                
	           
	        }
	    }
	    System.out.println(answer);
	}
}
