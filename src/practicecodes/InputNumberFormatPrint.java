package practicecodes;

import java.util.Scanner;

public class InputNumberFormatPrint 
{

	public static void main(String[] args) 
	{
		System.out.println("what is the total no of number you want to test :");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for (int i=0;i<n;i++) 
		{
			try 
			{
				long x=sc.nextLong();
					System.out.println("the number x can be fitted in : ");
					if (x>=-128 && x<=127) 
					{
						System.out.println("*byte")	;
					}
			if (x>=Short.MIN_VALUE && x<=Short.MAX_VALUE) 
			{
				System.out.println("*Short");		
			}
			if (x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
			{
				System.out.println("*Int");
		}
			if (x>=Long.MIN_VALUE && x<=Long.MAX_VALUE) 
			{
				System.out.println("*Long");
		
			}
		}
		catch(Exception e) 
			{
		
			System.out.println("The number can't be fitted anywhere");
	}
		}
	}
}


		
	
	
