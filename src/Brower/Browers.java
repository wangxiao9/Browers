package Brower;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browers {
	public WebDriver driver = null;
	private FirefoxProfile firefoxProfile = null;
	private DesiredCapabilities caps = null;
	private String projectpath = System.getProperty("user.dir");
	public Browers(BrowersType browersType) {
		switch(browersType) {
		case firefox:
			firefoxProfile = new FirefoxProfile();
			try {
				firefoxProfile.setPreference("webdriver.accept.untrust.certs", true);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			driver = new FirefoxDriver(firefoxProfile);
			driver.manage().window().maximize();
			break;
		case chrome:
			System.setProperty("webdriver.chrome.driver", projectpath+"/tools/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case ie:
			System.setProperty("webdriver.ie.driver", "D:/selenium/IEDriverServer64.exe");
			caps = DesiredCapabilities.internetExplorer();
			caps.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, false);
			caps.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
			caps.setCapability("ignoreZoomSetting", true);
			driver = new InternetExplorerDriver(caps);
			driver.manage().window().maximize();
			break;
		}
	}

}
