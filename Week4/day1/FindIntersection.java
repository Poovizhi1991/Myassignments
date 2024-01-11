package Week4.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		 List<Integer> arrayList = new ArrayList<>();
		for(int i =0;i<array1.length;i++)
		{
			arrayList.add(array1[i]);
			
			arrayList.add(array2[i]);
		}
		for(int j=0; j<arrayList.size()-1;j++)
		{
			if(arrayList.get(j)==arrayList.get(j+1))
			{
			System.out.println(arrayList.get(j));
			}
		}
	}

}
