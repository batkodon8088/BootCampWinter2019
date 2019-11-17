package BootCamp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import POM.homeWeb;

public class depotSignin {
	static WebDriver driver;
	
  @Test
  public void f() {
		  
			 homeWeb home=new homeWeb(driver);
			 
			 home.clickRegister();
			 home.emailfeild("batkodon8088@gmail.com*");
			 home.passwordfeild("mongol2019");
			 home.phoneNumberFeild("7032096782");
			 home.zipCodeFeild("22209");
			 home.createAccount();
		 
		 
		 }
	  
	  
  
  @BeforeTest
  public void beforeClass() {
	  
 System.setProperty("webdriver.chrome.driver","C:\\Users\\Uyanga\\eclipse-workspace\\Automation_aps_code\\Driver\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("https://www.homedepot.com");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
  driver.findElement(By.id("headerMyAccountTitle")).click(); //my account
 
  
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Uyanga\\eclipse-workspace\\Automation\\Driver\\geckodriver.exe");
	driver = new FirefoxDriver();
  driver.get("https://www.homedepot.com");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
  driver.findElement(By.id("headerMyAccountTitle")).click(); //my account
  
	  
  }

  @AfterTest
  public void afterClass() {
	  driver.close();
	  driver.quit();
  }


 
}
