package Expleo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RowCount {
  
	
	 WebDriver driver;
	 
	@Test
  public void PrintRowCount() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jagad\\OneDrive\\Desktop\\expleoTest\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
		List<WebElement> rows = driver.findElements(By.xpath("/html/body/div/div/div/div/div/div/table/tbody/tr"));
		
		int count = rows.size();
		  System.out.println("Row Count: " +count);	  
	  
  }
	
}
