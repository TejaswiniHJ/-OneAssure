package com.practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.Base_Class;
import com.generic.Data_proper;

public class TC3 {
	@Test
	public void loginpage() throws IOException
	{
		Data_proper dat=new Data_proper();
		Base_Class base=new Base_Class();
		base.launch();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://staging-app.oneassure.in/page/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@id='standard-full-width'])[1]")).sendKeys(dat.read("un"));
}
}