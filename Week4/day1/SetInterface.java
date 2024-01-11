package Week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;


public class SetInterface {
	
public static void main(String[] args) {
	
	// Print a set by converting string to character
	
	String companyName = "google";
	
	char[] charName= companyName.toCharArray();
	
	Set<Character> readChar = new LinkedHashSet<Character>();
	
	for(int i=0;i<charName.length;i++)
	{
		
		readChar.add(charName[i]);
	}
	System.out.println(readChar);
	String output = "";
	for(Character unique : readChar)
	{
		output=output+unique;
	}
	
	System.out.println(output);
 	
}
}
