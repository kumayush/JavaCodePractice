package practicecodes;

import java.util.Scanner;

public class Swapping {
	
	public static String Alternateswapp() {
		System.out.println("enter the even number string : ");
		Scanner sc=new Scanner(System.in);
				String str=sc.next();
				char[] arr=str.toCharArray();
				if (arr.length%2==1) {
					System.out.println("Please enter even no strings including spaces");
				}
				else {
					
					for(int i=0;i<arr.length-1;i+=2) 
					{
					char temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					}
					
					}
				return new String(arr);
				}
			
	
	
	public static void main (String[] args)
	{
		System.out.println(Alternateswapp());
	}
	

}

