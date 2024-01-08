package Week3.day2;

public class Safari extends Edge {
	public void readerMode()
	{
		System.out.println("Read Mode");
	}
	public void  fullScreenMode()
	{
		System.out.println("Full Screen Mode");
	}
	public static void main(String[] args) {
		
		Safari safariBrowser = new Safari();
		System.out.println("----Class Browser----");
		safariBrowser.openURL();
		safariBrowser.closeBrowser();		
		System.out.println("----Class Chrome ----");
		safariBrowser.openIncognito();
		safariBrowser.clearCache();
		System.out.println("--- Class Edge----");
		safariBrowser.takeSnap();
		safariBrowser.clearCookies();
		System.out.println("-------");
		safariBrowser.readerMode();
		safariBrowser.fullScreenMode();
		
	}
}
