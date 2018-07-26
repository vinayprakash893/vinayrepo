package pac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Capturedata {
	
		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.interviewquestionspdfs.com/tag/git-interview-questions-tutorialspoint/");
	        //List <WebElement> allquestions=driver.findElement(By.xpath("//div[@class='entry-content']"));
			//System.out.println(allquestions.size());
			
			String question=driver.findElement(By.xpath("//a[text()='What is GIT?']")).getText();
			System.out.println(question);
			driver.findElement(By.xpath("//a[text()='What is GIT?']")).click();
			//String x="//div[@class='entry-content']/p[text()='GIT is a distributed version control system and source code management (SCM) system with an emphasis to handle small and large projects with speed and efficiency.']"
			String answer=driver.findElement(By.xpath("//p[contains(text(),'GIT is a')]")).getText();
			System.out.println(answer);
			
			
			
			
			

		}

	}

}
