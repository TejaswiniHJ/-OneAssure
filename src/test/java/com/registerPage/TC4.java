package com.registerPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generic.Base_Class;
import com.generic.Data_proper;

public class TC4 {
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
		
		driver.findElement(By.xpath("//span[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//input[@id='standard-full-width']")).sendKeys(dat.read("un4"));
		driver.findElement(By.xpath("//span[text()='SEND OTP']")).click();
		
		String text = driver.findElement(By.xpath("//p[@id='standard-full-width-helper-text']")).getText();
		System.out.println(text);
		
	    String exp ="Please enter valid phone number";
		Assert.assertEquals(exp, text);
		
}
}
