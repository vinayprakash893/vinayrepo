package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailtest {

	public static void main(String[] args)  {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		WebElement wb=driver.findElement(By.id("identifierId"));
		wb.sendKeys("sashi99.b@gmail.com");
		WebElement wb1=driver.findElement(By.xpath("//span[text()='Next']"));
		wb1.click();
		
		
		WebElement wb2=driver.findElement(By.name("password"));
		wb2.sendKeys("rekha@49");
		WebElement wb3=driver.findElement(By.xpath("//span[text()='Next']"));
		wb3.click();
		
		WebElement wb4=driver.findElement(By.xpath("//span[@class='gb_db gbii']"));
		wb4.click();
		driver.manage().window().maximize();
		WebElement wb5=driver.findElement(By.linkText("Sign out"));
	   //WebElement wb5=driver.findElement(By.xpath("//a[text()='Sign out']"));
	    wb5.click();
//	    WebElement wb6=driver.findElement(By.xpath("//div[@class='mUbCce fKz7Od lfjjye M9Bg4d']"));
//		wb6.click();
//		WebElement wb7=driver.findElement(By.xpath("//button[@class='q4UYxb']"));
//		wb7.click();
	    driver.close();
		
		

	}

}
