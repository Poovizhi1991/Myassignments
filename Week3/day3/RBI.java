package Week3.day3;



public interface RBI {
	
	String accountName ="Poovizhi";// S-->Static, F-->Final	
	public void updateKYC();//unimplement method
	public void withdrawalLimit();
	
	//Implement Method
	default void accountHolderDetails(String accountHolderName, long mobileNumber,String panNo)
	{
		System.out.println("");
	}
	
}
