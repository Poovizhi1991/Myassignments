package Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		//String parentWindow = driver.getWindowHandle();
		//System.out.println("Parent Window: "+parentWindow); 
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> windowLis = new ArrayList<String>(windowHandle);
		driver.switchTo().window(windowLis.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(windowLis.get(0));
		driver.close();

	}

}
