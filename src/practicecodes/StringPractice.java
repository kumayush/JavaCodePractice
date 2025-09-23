package practicecodes;

import java.util.Scanner;

public class StringPractice {
	
	public static void reverseString() 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string you want to reverse : ");
		String str=sc.nextLine();
		//String str="ayush";
		String empty="";
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.length());
		for(int i=sb.length()-1;i>=0;i--) {
			String Characters=Character.toString(sb.charAt(i));
			empty=empty+Characters;
			
		}
		System.out.println(empty);
		
	}
	public static void reverseString2() 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string you want to reverse : ");
		String str=sc.nextLine();
		String empty="";
		//String str="ayush";
		String object=new String(str);
		System.out.println(object.length());
		for(int i=object.length()-1;i>=0;i--) {
			
			String Characters=Character.toString(object.charAt(i));
			empty=empty+Characters;
			
		}
		System.out.println(empty);
		
	}
	
	public static String ReplaceLeadingZero() 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string : ");
		String str=sc.next();
		int i=0;
		while(i<str.length()&&str.charAt(i)=='0')
			i++;
		System.out.println(i);
		StringBuffer empty=new StringBuffer(str);
		empty.replace(0, i,"");
		return empty.toString();
		
		
		
	}
	
	public static String ReplaceAllZero() 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string : ");
		String str=sc.next();
		//StringBuilder sb=new StringBuilder(sb);
		String newstr=str.replace("0", "");
		//StringBuffer empty=new StringBuffer(str);
		//empty.replace(0, i,"");
		return newstr;
		
		
		
	}
	
	static String removeTrailingZeroes(String s) {
	    StringBuilder sb = new StringBuilder(s);
	    System.out.println("the length of the character is :"+sb.length());
	    while (sb.length() > 0 && sb.charAt(sb.length() - 1) == '0') {
	        sb.setLength(sb.length() - 1);
	    }
	    return sb.toString();
	}
	
	public static void replaceStringAtIndex() {
		{
	        // Get the String
	        String str = "Geeks Gor Geeks";
	 
	        // Get the index
	        int index = 7;
	 
	        // Get the character
	        char ch = 'a';
	 
	        // Print the original string
	        System.out.println("Original String = " + str);
	 
	        StringBuilder string = new StringBuilder(str);
	        string.setCharAt(index, ch);
	        
	        // Print the modified string
	        System.out.println("Modified String = " + string);
	    }	
		
	}

	public static void main(String[] args) {
		
		//replaceStringAtIndex();
		//String result=removeTrailingZeroes("ayus10100000");
		String result=ReplaceLeadingZero() ;
		System.out.println("final string is "+ result);
	}
	}


