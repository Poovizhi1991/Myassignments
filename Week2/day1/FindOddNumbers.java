package Week2.day1;

public class FindOddNumbers {

		public static void main(String[] args) {
			// Finding odd numbers using if and for  control statement
			System.out.println("Odd Numbers from 1 to 10");
			FindOddNumbers oddnumber = new FindOddNumbers();
			oddnumber.getnumbers(1, 10);
			

		}
		public void getnumbers(int initalization, int number)
		{
			for(int i = initalization;i<=number;i++)
			{
				if(i%2==1)
				{
					System.out.println(i);
				}
			}
			
		}

	}



