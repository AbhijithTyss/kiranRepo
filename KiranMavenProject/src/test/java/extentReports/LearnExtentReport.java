package extentReports;

import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReport {
	

	@Test
	public void extentRepo() {
		WebDriver driver=new ChromeDriver();
		TakesScreenshot ts=(TakesScreenshot) driver;
		driver.get("https://demowebshop.tricentis.com/");
		
		String time = LocalDateTime.now().toString().replace(":", "_");
		ExtentSparkReporter spark=new ExtentSparkReporter("./extentReport/ExtentDemoReport"+time+".html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(spark);
		ExtentTest test = report.createTest("extentRepo");
		test.log(Status.PASS, "user successfully logged in");
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));
		report.flush();
	}
}
