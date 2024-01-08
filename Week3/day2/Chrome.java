package Week3.day2;

public class Chrome extends Browser {
	
	public void openIncognito()
	{
		System.out.println("The Chrome browser is opened");
	}
	public void  clearCache()
	{
		System.out.println("Cache is cleared");
	}
	public static void main(String[] args) {
		
		Chrome browser1 = new Chrome();
		browser1.openURL();
		browser1.closeBrowser();
		browser1.navigateBack();
		System.out.println("--------");
		browser1.openIncognito();
		browser1.clearCache();
		
		
	}

}
