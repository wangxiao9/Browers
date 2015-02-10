package Mail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import Parameters.jiexiProperties;

public class Mail163 {
  
  private WebDriver driver;
  private jiexiProperties data;
  private Do du;
  
  @BeforeClass
  public void beforeClass() {
	  data = new jiexiProperties(System.getProperty("user.dir"+"/tools/test.properties"));
  }

  @Test
  public void f() {
  }
  
  @AfterClass
  public void afterClass() {
  }

}
