package Week1.day1;

public class Mobile {
	//Method Definition - Assignment 2
	public static void main(String[] args) {
		
		Mobile myMobile = new Mobile();
		System.out.println("This is my Mobile");
		System.out.println("------------------");
		myMobile.makeCall();
		myMobile.sendMsg();
	}
	public void makeCall()
	{
		String moblieModel="Oppo K10";
		float mobileWeight=120;
		System.out.println("Mobile Model= "+moblieModel);
		System.out.println("Mobile Weight= "+mobileWeight);
		
		
	}
	public void sendMsg()
	{
		boolean isFullRecharged=true;
		int mobileCost=23000;
		System.out.println("Is Full Recharged= "+isFullRecharged);
		System.out.println("Mobile Cost= "+mobileCost);
		
	}

}
