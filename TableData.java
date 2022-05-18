package Expleo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableData {
	 WebDriver driver;
	 
	@Test
 
  public void GetTableData() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Jagad\\OneDrive\\Desktop\\expleoTest\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	  driver.get("https://the-internet.herokuapp.com/challenging_dom");
	  
	  WebElement table = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/table"));
	  System.out.println(table.getText());
  }
}
