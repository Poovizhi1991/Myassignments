package Week3.day2;

public class Edge extends Chrome {
	
	public void takeSnap()
	{
		System.out.println("Take a snap");
	}
	public void  clearCookies()
	{
		System.out.println("Clear cookies");
	}
	public static void main(String[] args) {
		
		Edge edgeBrowser = new Edge();
		System.out.println("----Class Browser----");
		edgeBrowser.openURL();
		edgeBrowser.closeBrowser();		
		System.out.println("----Class Chrome ----");
		edgeBrowser.openIncognito();
		edgeBrowser.clearCache();
		System.out.println("-------");
		edgeBrowser.takeSnap();
		edgeBrowser.clearCookies();
		
		
	}

}
