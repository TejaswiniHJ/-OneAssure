package com.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;



public class Base_Class {
WebDriver driver;
Data_proper dat=new Data_proper();

	@BeforeSuite
	public void JDBCconnection()
	{
		System.out.println("connection done");
	}
	
	
	
	@BeforeClass
	public void launch() throws IOException
	{
		String Browser = dat.read("browser");
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (Browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}

	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		
		driver.get(dat.read("url"));
		
		

	}
	
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		
	}
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	
	
	 
	@AfterSuite(groups={"Regression","Smoke"})
	public void JDBCconnect()
	{
		System.out.println("connection done");
	}

}


