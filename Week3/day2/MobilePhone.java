package Week3.day2;

public class MobilePhone {
	public void makeCall()
	{
		System.out.println("Make a call");
	}
	public void sendMsg()
	{
		System.out.println("Send message to a friend");
	}
	public void setAlaram() {
		System.out.println("Set Alaram");
	}
	public void takeSnap()
	{
		System.out.println("Take a snap");
	}

	public static void main(String[] args) {
		
		MobilePhone mobile = new MobilePhone();
		mobile.makeCall();
		mobile.sendMsg();
		mobile.setAlaram();
		mobile.takeSnap();

	}
}
