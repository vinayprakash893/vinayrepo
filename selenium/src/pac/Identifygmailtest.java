package pac;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Identifygmailtest {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://gmail.com");
	WebElement wb=driver.findElement(By.id("identifierId"));
	wb.sendKeys("sashi99.b");
	WebElement wb1=driver.findElement(By.xpath("//span[text()='Next']"));
	wb1.click();
	Thread.sleep(4000);
	WebElement wb2=driver.findElement(By.name("password"));
	wb2.sendKeys("rekha@49");
	WebElement wb2N=driver.findElement(By.xpath("//span[text()='Next']"));
	wb2N.click();
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
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
