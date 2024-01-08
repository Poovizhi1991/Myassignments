package Week3.day3;

public  class CanaraBank implements Payments{

	@Override
	public void cashOnDelivery() {
		
		System.out.println("Cash on delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI payments");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Card Payments");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Internet Banking");
	}
	
	
	public void recordPaymentDetails()
	{
		System.out.println("Record payment details");
	}
	
	

}
