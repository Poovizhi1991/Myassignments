package Week3.day3;

public class MyBank extends AxisBank {
	public void personalLoan()
	{
		System.out.println("No need");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBank bank  = new MyBank();
		bank.accountHolderDetails("poovizhi", 134521678, "RTH900");

	}

}
