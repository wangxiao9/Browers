package Brower;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestBrowers {
	
	private WebDriver driver;

  @BeforeClass
  public void beforeClass() {
	  Browers browers = new Browers(BrowersType.chrome);
	  driver = browers.driver;
	  
  }

  @Test
  public void startBrowers() {
	  driver.get("http://www.baidu.com");
  }
  
  @AfterClass
  public void afterClass() {
  }

}
