package shoppingcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_003_Test {
	public static WebDriver driver;
	@Test
	public void demo3() {
		Reporter.log("TC_003_Test executed",true);
		driver=new ChromeDriver();
	}
}
