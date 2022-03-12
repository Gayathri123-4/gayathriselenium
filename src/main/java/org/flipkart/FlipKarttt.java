package org.flipkart;

import java.util.Date;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipKarttt  extends BaseClass{
	
	@BeforeClass
	private void beforeclass() {
		chromeLaunch();
		impwait(10);

	}
		
	@AfterClass
	private void afterclass() {
		quit();

	}
		
	@BeforeMethod
	private void beforemethod() {
		Date d=new Date();
		System.out.println("Before Method------------------"+d);

	}
	@AfterMethod
	private void aftermethod() {
		Date d= new Date();
		System.out.println("After Method----------------"+d);

	}
		
	@Test
	private void test1() {
		urlLaunch("https://flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();;
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphones");
		driver.findElement(By.xpath("//button[contain(@type,'submit')]")).click();

	System.out.println("-------------------------IPHONELIST-------------------");	
	List<WebElement> e = driver.findElements(By.xpath("//div[contains(text(),'APPLE iphone')]"));
for (int i = 0; i < e.size(); i++) {
	WebElement f = e.get(i);
	String text = f.getText();
	System.out.println("text");
	
	
	
}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


