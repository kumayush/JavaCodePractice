package sdetInterviewCode2;

import java.util.Stack;

public class NumberReverseStack {

	public static void main(String[] args) {
	int number=12345;
	int reversed=0;
	Stack<Integer>st=new Stack();
	while(number>0) {
		int rem=number%10;
		st.push(rem);
		number/=10;
		
	}
	
	int unit=1;
	while(!st.empty()) {
		reversed=reversed+st.pop()*unit;
		unit=unit*10;
	}
System.out.println(reversed);
	}

}
