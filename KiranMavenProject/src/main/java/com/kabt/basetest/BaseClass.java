package com.kabt.basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;
	@Parameters("browserName")
	@BeforeClass
	public void browserSetup(@Optional("chrome") String bname) {
		if (bname.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			Reporter.log("chrome browser launched",true);
		}else if(bname.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			Reporter.log("firefox browser launched",true);
		}
		driver.manage().window().maximize();
	}
}