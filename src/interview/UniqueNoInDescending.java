package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNoInDescending {
	
	public static void sort(List<Character> abc ) {
		int n=abc.size();
		for (int i=0;i<n-1;i++) {
			for (int j=0;j<n-1-i;j++) {
				if (abc.get(j)<abc.get(j+1)) {
					char temp = abc.get(j);
					abc.set(j, abc.get(j+1));
					abc.set(j+1, temp);
					
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int number=105209612;
		String abc=String.valueOf(number);
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<abc.length();i++) {
			
		if(abc.charAt(i)!='0') {
			sb.append(abc.charAt(i));
		}

	}
		
		System.out.println(sb);
	String newString=	sb.toString();
	char [] numberarray=newString.toCharArray();
	Set<Character> st=new HashSet<>();
	for (int i=0;i<numberarray.length;i++) {
		st.add(numberarray[i]);
	}
	
	System.out.println("the set is "+st);	
	
	List<Character> lst=new ArrayList<>(st);
	sort(lst);
	
	StringBuilder sb2 = new StringBuilder();
    for (char c : lst) {
        sb2.append(c);
    }

    System.out.println("final output is "+sb2);
}
	
}
