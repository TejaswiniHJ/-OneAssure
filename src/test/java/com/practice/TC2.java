package com.practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.Base_Class;
import com.generic.Data_proper;

public class TC2 {
	@Test
	public void HomePage() throws IOException
	{
		Data_proper dat=new Data_proper();
		Base_Class base=new Base_Class();
		base.launch();

		WebDriver driver=new ChromeDriver();
		driver.get("https://staging-app.oneassure.in/page/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@id='standard-full-width'])[1]")).sendKeys(dat.read("un"));
		driver.findElement(By.xpath("(//input[@id='standard-full-width'])[2]")).sendKeys(dat.read("pwd"));
		driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();

//		WebElement abc=driver.findElement(By.xpath("//span[@class='MuiTypography-root font_bold undefined MuiTypography-caption']"));
//		String act=abc.getAttribute("class");
//		System.out.println(act);
//		String exp="MuiTypography-root font_bold undefined MuiTypography-caption";
//		Assert.assertEquals(exp, act);

	}
}

