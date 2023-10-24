package login;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_001_Test {
	@Test
	public void demo() {
		Reporter.log("TC_001_Test executed",true);
		
		// Recieving data from maven parameter
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
	}
}