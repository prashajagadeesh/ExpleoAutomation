package Expleo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RowData {
	WebDriver driver;
	
  @Test
  public void PrintRowData() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagad\\OneDrive\\Desktop\\expleoTest\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	  driver.get("https://the-internet.herokuapp.com/challenging_dom");
	  WebElement table=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table"));
	  String row_data=table.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[7]/td[3]")).getText();
	  System.out.println(row_data);
	  
	  
	  
  }
}
