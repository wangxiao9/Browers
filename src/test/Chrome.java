package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Chrome {
	private  String projectpath = System.getProperty("user.dir");
	public  WebDriver driver =null;

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", projectpath + "/tools/chromedriver");
	  driver = new ChromeDriver();
  }
  
  @Test
  public void start() {
	  driver.get("http://www.baidu.com");
  }

  @AfterClass
  public void afterClass() {
  }

}
