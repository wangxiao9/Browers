package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/°²×°Èí¼þ/firefox/firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
	}

}
