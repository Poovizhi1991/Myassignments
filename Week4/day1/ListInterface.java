package Week4.day1;

import java.time.Duration;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id='inputValEnter']")).sendKeys("phone mobile"+Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> phoneName = driver.findElements(By.xpath("//span[@class='lfloat product-price']")); 
		List<Integer> mobilePrice = new LinkedList<Integer>();
		for (int i=0; i<phoneName.size();i++)
		{
			String getmobileprice = phoneName.get(i).getText();
			int mobPrice = Integer.parseInt(getmobileprice.replaceAll("[^0-9]",""));
			mobilePrice.add(mobPrice);		
		}
		Collections.sort(mobilePrice);
		System.out.println(mobilePrice);
		
	}
}
