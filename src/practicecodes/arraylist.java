package practicecodes;

import java.util.ArrayList;

public class arraylist {
	
	public static void main (String[]args) {
		ArrayList<Integer> alist=new ArrayList<>();
		alist.add(1);
		alist.add(2);
		alist.add(4);
		alist.add(5);
		alist.add(6);
		System.out.println(alist.get(alist.size()-1));
	}

}
