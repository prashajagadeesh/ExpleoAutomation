package Expleo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonText {
	WebDriver driver;
	
  @Test
  public void ReadButtonText() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Jagad\\OneDrive\\Desktop\\expleoTest\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	  driver.get("https://the-internet.herokuapp.com/challenging_dom");
	  System.out.println(driver.findElement(By.xpath("//a[@class = 'button']")).getText());
	  
  }
}
