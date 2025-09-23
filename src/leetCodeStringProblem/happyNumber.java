package leetCodeStringProblem;

import java.util.HashSet;
import java.util.Set;

public class happyNumber {
	
	public boolean isHappy(int n) {
	Set<Integer>hs=new HashSet<>();
	while (n!=1&&!hs.contains(n)) {
		hs.add(n);
		int sumOfSquare=0;
		
		while(n!=0) {
		int digit=n%10;	
		sumOfSquare+=digit*digit;
		n=n/10;
		}
		
		n=sumOfSquare;		
	}
		
	
	return n==1;
		
	
	}

	public static void main(String[] args) {
		happyNumber hn=new happyNumber();
		int n=2;
		boolean res=hn.isHappy(n);
		System.out.println(res);
	}

}
