package test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParametersTest {
	
	@Parameters({"first"})
	@Test
	public void test(String First) {
		System.out.println(First);
		
	}
	
}