package Week4.day4;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableERail {

	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fromSt = driver.findElement(By.id("txtStationFrom"));
		fromSt.clear();
		fromSt.sendKeys("MAS"+Keys.ENTER);
		WebElement toSt= driver.findElement(By.id("txtStationTo"));
		toSt.clear();
		toSt.sendKeys("MDU"+Keys.ENTER);	
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement> trainNameList = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr"));
		Set<String> trainNames = new LinkedHashSet<String>();
		System.out.println("Train Name");
		System.out.println("----------");
		for(int i=2;i<= trainNameList.size();i++)
		{
			String trainName=driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr["+i+"]/td[2]")).getText();
						
			System.out.println(trainName);
		
			trainNames.add(trainName);
		}
		System.out.println("----------------------");
		if(trainNameList.size()==trainNames.size())
		{
			System.out.println("Duplicate is not found.");
		}
		else
		{
			System.out.println("Duplicate is found.");
		}
	}
}

