package Week2.day3;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		// Login facebook account using selenium webdriver
		
		ChromeDriver sDriver=new ChromeDriver();
		sDriver.manage().window().maximize();
		sDriver.get("http://www.facebook.com/");
		
		WebElement emailId = sDriver.findElement(By.id("email"));
		emailId.sendKeys("testleaf.2023@gmail.com");
		
		WebElement password = sDriver.findElement(By.name("pass"));
		password.sendKeys("Tuna@321");
		
		WebElement loginBtn = sDriver.findElement( By.name("login"));
		loginBtn.click();	
	
		
		String homepagetitle = sDriver.getTitle();
		if(homepagetitle.contains("Log in to Facebook"))
		{
			System.out.println("Home page is verified");
			
		}
		else
		{
			System.out.println("unable to verify my home page");
		}
		


	}

}
