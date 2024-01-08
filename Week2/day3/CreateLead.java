package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
public static void main(String[] args) {

	//Launch the browser
			ChromeDriver driver = new ChromeDriver();			
			
			driver.manage().window().maximize();	
			
			driver.get("http://leaftaps.com/opentaps/");			
			
			WebElement username = driver.findElement(By.id("username"));			
			username.sendKeys("demosalesmanager");			
			
			WebElement password = driver.findElement(By.name("PASSWORD"));			
			password.sendKeys("crmsfa");	
			
		
			WebElement loginBtn = driver.findElement(By.className("decorativeSubmit"));
			loginBtn.click();	
			driver.findElement(By.linkText("CRM/SFA")).click();
				
				
			
			driver.findElement(By.linkText("Leads")).click();
			
			
			driver.findElement(By.linkText("Create Lead")).click();			
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cruzze");			
			
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Poovizhi");			
		
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabha");
			WebElement sourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));			
			Select souurceValue = new Select(sourceId);			
			souurceValue.selectByIndex(4);
			
			WebElement markCampId = driver.findElement(By.name("marketingCampaignId"));			
			Select markCampValue = new Select(markCampId);
			markCampValue.selectByValue("9001"); 	
			
			WebElement ownershipId = driver.findElement(By.name("ownershipEnumId"));
			Select ownerShipValue = new Select(ownershipId);
			ownerShipValue.selectByIndex(5);			 
			
			WebElement countryId = driver.findElement(By.name("generalCountryGeoId"));
			Select countryValue = new Select(countryId);
			countryValue.selectByVisibleText("India");
			
			driver.findElement(By.name("submitButton")).click();
			
			String leadTitle = driver.getTitle();
			System.out.println(leadTitle);
}

}
