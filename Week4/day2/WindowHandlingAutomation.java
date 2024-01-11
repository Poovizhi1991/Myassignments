package Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAutomation {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Enter username and password
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");				
		WebElement passWord = driver.findElement(By.name("PASSWORD"));
		passWord.sendKeys("crmsfa");
		//Click on Login
		WebElement loginBtn = driver.findElement( By.className("decorativeSubmit"));
		loginBtn.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();		
			
		driver.findElement(By.xpath("//img[@alt='Lookup'][1]")).click();
		Set<String> windowHandle = driver.getWindowHandles();
	    List<String> windowLis = new ArrayList<String>(windowHandle);
	    driver.switchTo().window(windowLis.get(1));
	    driver.manage().window().maximize();
		
		
	}
	

}
