package pac;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Identifyfbtest {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://facebook.com");
	WebElement wb=driver.findElement(By.id("email"));
	wb.sendKeys("sashi99.b@gmail.com");
	
	WebElement wb2=driver.findElement(By.name("pass"));
	wb2.sendKeys("rekha@49");
	WebElement wb2N=driver.findElement(By.xpath("//label[@id='loginbutton']"));
	wb2N.click();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	Dimension dem=new Dimension(100,500); 
	driver.manage().window().setSize(dem); 
	String pageTitle=driver.getTitle();
	System.out.println(pageTitle);
	String pageUrl=driver.getCurrentUrl();
	System.out.println(pageUrl);
	Thread.sleep(3000);
	driver.close();
	
}
}
