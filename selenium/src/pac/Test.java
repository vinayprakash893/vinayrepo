package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement wmb=driver.findElement(By.id("month"));
		Select sel=new Select(wmb);
		sel.selectByVisibleText("Dec");
//		Dimension dem=new Dimension(100,500); 
//		driver.manage().window().setSize(dem); 
//		String pageTitle=driver.getTitle();
//		System.out.println(pageTitle);
//		String pageUrl=driver.getCurrentUrl();
//		System.out.println(pageUrl);
		
		//driver.close();
		
		//select sel=new select(mwb)
	}
}
