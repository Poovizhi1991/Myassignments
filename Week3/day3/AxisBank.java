package Week3.day3;

public abstract class AxisBank implements RBI {
	

	public void updateKYC() {
		// TODO Auto-generated method stub
		System.out.println("Know your customer Details");
		
	}
	
	public void debitCard()
	{
		System.out.println("people age should be greater than 18");
	}
	public void debitCardLimit()
	{
		System.out.println("Debit card limit will be 50,000");
	}
	
	public abstract void personalLoan();

	
	  public void withdrawalLimit() { // TODO Auto-generated method stub
		  System.out.println("Withdraw limit should be 49,000");
	  }
	 	
	public static void main(String[] args) {
		//AxisBank bank = new AxisBank(;)
		
	}


}
