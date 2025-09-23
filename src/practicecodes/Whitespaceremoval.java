package practicecodes;

import java.util.Scanner;

public class Whitespaceremoval {
	
	public static void main(String[] args) 
	{
		
		Scanner	sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING ");
		 String a =sc.nextLine();
		 String b ="";
		
		for (int i=0;i<a.length();i++) 
		{
		char c=a.charAt(i);
		if(!Character.isWhitespace(c)) 
		{
			b+=c;

		}
		
		
		}
		
		
	System.out.println("the final string is : "+b);
	
		

	}

}
