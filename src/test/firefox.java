package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/��װ���/firefox/firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
	}

}
