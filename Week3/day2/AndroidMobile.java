package Week3.day2;

public class AndroidMobile extends MobilePhone {
	
	public void navigation()
	{
		System.out.println("Google Map");
	}
	public void getApps()
	{
		System.out.println("Play Store");
	}

	public static void main(String[] args) {
		AndroidMobile android = new AndroidMobile();
		android.sendMsg();
		android.makeCall();
		android.navigation();
		android.getApps();
	

	}

}
