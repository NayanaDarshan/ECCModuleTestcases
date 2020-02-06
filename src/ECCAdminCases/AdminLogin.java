package ECCAdminCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AdminLogin {
   WebDriver driver;
   String BaseURL;
   
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-13.0.1\\lib\\chromedriver.exe\\");
	  driver= new ChromeDriver();
	  //declaration of URL
	  BaseURL="http://ecc224dev.magento2.qa/admin1234 ";
	  driver.get(BaseURL);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	 String TitleName= driver.getTitle();
	 System.out.println("The title is " +TitleName);
	  
	  
  }

  
  @Test
  public void f() {
  }
  
  
  @AfterClass
  public void afterClass() {
  }

}
