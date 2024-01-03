package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountLeaftaps {
	public static void main(String[] args) {
		//Create an account for leaftap site
				// Open the URL
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps");
				//Enter username and password
				WebElement userName = driver.findElement(By.id("username"));
				userName.sendKeys("demosalesmanager");				
				WebElement passWord = driver.findElement(By.name("PASSWORD"));
				passWord.sendKeys("crmsfa");
				//Click on Login
				WebElement loginBtn = driver.findElement( By.className("decorativeSubmit"));
				loginBtn.click();
				//Click on CRM/SFA
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Accounts")).click();
				driver.findElement(By.linkText("Create Account")).click();
				
				//driver.findElement(By.xpath("//"))  CRM/SFA
						
				// 
				
	}

}
