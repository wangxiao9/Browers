package Parameters;

import java.net.URL;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamentersTest1 {
  @Parameters({"TestData"})
  @Test
  public void test(String testdata) {
	  jiexiProperties pp = new jiexiProperties(System.getProperty("user.dir")+testdata);
	  System.out.println(pp.getValue("url"));
	  System.out.println(pp.getValue("username"));
	  System.out.println(pp.getValue("password"));
	  
  }
}
