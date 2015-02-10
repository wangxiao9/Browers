package Parameters;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import Wait.Wait;
//import Wait.Wait;
import Brower.Browers;
import Brower.BrowersType;

@Test public class ParametersTest2 {
	
	protected static WebDriver driver = null;
	//private String projectpath = System.getProperty("user.dir");
	private jiexiProperties Data;
	private jiexiProperties Locator;
	private Wait wait = null;
	
	
  @Parameters({"Data","Locator"})
  @BeforeClass
  public void startBrower(@Optional("data")String data,@Optional("locator")String locator) {
	  Data = new jiexiProperties(System.getProperty("user.dir")+data);
	  Locator = new jiexiProperties(System.getProperty("user.dir")+locator);
	  
	  Browers browers = new Browers(BrowersType.chrome);
	  driver = browers.driver;
	  wait = new Wait(driver);
  }
  
  public void f() {
	 
	  driver.get(Data.getValue("url"));
	  driver.findElement(By.xpath(Locator.getValue("username"))).clear();
	  driver.findElement(By.xpath(Locator.getValue("username"))).sendKeys(Data.getValue("username"));
	  driver.findElement(By.xpath(Locator.getValue("password"))).sendKeys(Data.getValue("password"));
	  driver.findElement(By.xpath(Locator.getValue("loginBtn"))).click();
	  WebElement we = driver.findElement(By.xpath(Locator.getValue("homepage")));
	  wait.waitForElementPresent(Locator.getValue("homepage"));
	  Assert.assertEquals(we.isDisplayed(), false);
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
