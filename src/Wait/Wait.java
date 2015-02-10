package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.css.sac.Locator;

public class Wait {
	private WebDriver driver;
	private int timeout = 10;
	public Wait (WebDriver dirver) {
		this.driver = dirver;	
	}

	public void waitForElementPresent(String locator) {
		try {
			(new WebDriverWait(driver,timeout)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void waitForElementIsEnable(String locator) {
		
			(new WebDriverWait(driver, timeout)).until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	
	}
	
	public void waitFor(long timeout) {
		try {
			Thread.sleep(timeout);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}



}
