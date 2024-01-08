package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
				driver.findElement(By.id("accountName")).sendKeys("SampleAccount");
				
				WebElement industry = driver.findElement(By.name("industryEnumId"));
				Select industryvalue=new Select(industry);
				industryvalue.selectByVisibleText("Computer Software");
				
				WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
				Select ownershipvalue=new Select(ownership);
				ownershipvalue.selectByVisibleText("S-Corporation");
				
				WebElement source = driver.findElement(By.id("dataSourceId"));
				Select sourcevalue=new Select(source);
				sourcevalue.selectByValue("LEAD_EMPLOYEE");
				
				WebElement marketCamp = driver.findElement(By.id("marketingCampaignId"));
				Select marketCampValue=new Select(marketCamp);
				marketCampValue.selectByIndex(6);
				
				WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
				Select statevalue=new Select(state);
				statevalue.selectByValue("TX");
				
				driver.findElement(By.className("smallSubmit")).click();			
				WebElement getAccName= driver.findElement(By.xpath("//input[@id='accountName']"));
				String accName = getAccName.getAttribute("value");
				System.out.println(accName);
				if(accName.contains("SampleAccount"))
				{
					System.out.println("Account name is verified");
				}
				else
				{
					System.out.println("Account name is not verified");
				}	
				
				driver.close();
				
	}

}
