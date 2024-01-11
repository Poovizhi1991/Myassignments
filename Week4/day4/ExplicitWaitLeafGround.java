package Week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitLeafGround {
	
	public static void main(String[] args) {
		// Explicit wait using WebDriverWait
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement textChange = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"j_idt87:j_idt98\"]/span")));
		textChange.click();
		boolean text = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Did you notice?']"))); 
		System.out.println(text);
	}

}
