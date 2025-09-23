package sdetInterviewCodes;

import java.util.Scanner;

public class CharInputProblem {

	public static void main(String[] args) {
	 Scanner sc=new Scanner (System.in);
	 System.out.println("Enter any character between A to Z : ");
	char ch=sc.next().charAt(0);
		
		  for (char c='A';c<=ch;c++) 
		  { 
			  int number=(c-'A')+1;
		  System.out.print(c+""+number); 
		  }
		 
	 
	}

}
