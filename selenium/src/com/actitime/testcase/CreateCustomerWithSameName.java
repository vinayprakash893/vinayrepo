package com.actitime.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * 
 * @author Sashi
 *
 */

public class CreateCustomerWithSameName {

	public static void main(String[] args) throws InterruptedException {
		String userName= "admin";
		String password= "manager";
		String customerName="ICICI_88";
		String expectedMsg ="has been successfully created";
		
		/* Step1:Login to Application */
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://uftuser.pc/login.do");
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		
		/* Step2 : Navigate to Task Page */
		driver.findElement(By.xpath("//div[text()='Task']")).click();
		Thread.sleep(1000);
		
		/*Step3 : Navigate to Project And Customer Page */
		driver.findElement(By.linkText("Projects & Customers")).click();
		Thread.sleep(1000);
		
		/*Step4: Navigate Create New Customer Page */
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		Thread.sleep(1000);
		
		
		/*Step5:Create new Customer */
		driver.findElement(By.name("name")).sendKeys(customerName);
		driver.findElement(By.name("CreateCustomerSubmit")).click();
		Thread.sleep(1000);
		
		/* ER:Verify Customer successfully Msg*/
		String actMSG=driv
		
		
		
		

		
		
		
		
		
		

	}

}
