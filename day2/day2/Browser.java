package Week1.day2;

public class Browser {

	public static void main(String[] args) {
	
      Browser printBrowser = new Browser();
      printBrowser.launchBrowser("Google");
      printBrowser.loadUrl();
	}
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		return browserName;
	}
	public void loadUrl()

	{
		System.out.println("Application url loaded successfully");
	}
}
