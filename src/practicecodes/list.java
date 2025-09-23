package practicecodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list {

	public static void main(String[] args) {
		List<Integer>ls=new ArrayList<>(Arrays.asList(1,2,3,4,6));
		System.out.println(ls);
		
		
		List<Integer>first=new ArrayList<>();
		for (int i=0;i<ls.size()/2;i++) {
			first.add(ls.get(i));
		}
		System.out.println(first);
		
		List<Integer>second=new ArrayList<>();
		for (int i=ls.size()/2;i<ls.size();i++) {
			second.add(ls.get(i));
		}
		System.out.println(second);
		

	}

}
