package Week1.day1;

public class Bike {

	public static void main(String[] args) {
		// Create two objects for two classes - Assignment 4
		Car myCar =  new Car();
		Bike myBike = new Bike();
		
		myCar.applyBreak();
		myCar.soundHorn();
		myBike.bikeride();

	}
	public void bikeride()
	{
		System.out.println("Applied bike break");
	}

}
