package practicecodes;

import java.util.Scanner;

public class PrimeNoInRange {
	public static boolean prime(int num) 
	{
		if(num<=1) 
		{
			return false;
		}
		else {
			for(int i=2;i*i<=num;i++)
			{
				if(num%i==0) 
				{
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println("enter the lower number of the range: ");
		Scanner sc=new Scanner(System.in);
		int lower=sc.nextInt();
		System.out.println("enter the higher number of the range: ");
		int higher=sc.nextInt();
		for(int j=lower;j<=higher;j++) {
		if (prime(j)) {
			System.out.println(j);	
		}
			
		}
		}
	}
		