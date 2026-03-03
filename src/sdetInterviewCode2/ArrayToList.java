package sdetInterviewCode2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayToList {

	public static void main(String[] args) {
		String[] arr= { "One", "Two", "Three", "Four" };
		ArrayList<String> list=new ArrayList<String>();
		Collections.addAll(list, arr);
		System.out.println(list);
	
	

}
}
