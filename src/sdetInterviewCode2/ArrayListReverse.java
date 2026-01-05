package sdetInterviewCode2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {

	public static void main(String[] args) {
		ArrayList<String> arrlist=new ArrayList();
		arrlist.add("Nokia");
		arrlist.add("Samsung");
		arrlist.add("iPhone");
		arrlist.add("One+");
		System.out.println("Before Reverse ArrayList:");
		System.out.println(arrlist);
		Collections.reverse(arrlist);
		System.out.println("After Reverse ArrayList:");
		System.out.println(arrlist);
	}

}
