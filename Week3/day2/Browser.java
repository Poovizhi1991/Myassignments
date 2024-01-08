package Week3.day2;

public class Browser {
	String browserName="Chrome";
	int browserVersion=37;
	public void openURL()
	{
		System.out.println(browserName+browserVersion+" URL is opened");
	}
	public void closeBrowser() {
		System.out.println(browserName+browserVersion+" is closed");
	}
	public void navigateBack()
	{
		System.out.println(browserName+browserVersion+" is navigated");
	}
	public static void main(String[] args) {
		
		
		Browser browserAction = new Browser();
		browserAction.openURL();
		browserAction.closeBrowser();
		browserAction.navigateBack();	
		
	}
}
