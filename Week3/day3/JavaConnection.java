package Week3.day3;

public class JavaConnection implements DatabseConnection {

	@Override
	public void connect() 
	{		
		System.out.println("Connect the database.");
		
	}

	@Override
	public void disconnect() 
	{
		System.out.println("Disconnect the database.");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute the database.");
		
	}	
	
	public static void main(String[] args) {
		JavaConnection dbConnection = new JavaConnection();
		dbConnection.connect();
		dbConnection.executeUpdate();
		dbConnection.disconnect();		
		
	}
}
