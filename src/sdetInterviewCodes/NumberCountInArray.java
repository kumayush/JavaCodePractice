package sdetInterviewCodes;

import java.util.HashMap;
import java.util.Map.Entry;

public class NumberCountInArray {

	public static void main(String[] args) {
		
		int [] inputArray={2,4,2,5,6,2,6,6,2,6};
		HashMap<Integer,Integer> hm =new HashMap<>();
		for (int arr:inputArray) {
			/*
			 * if (hm.containsKey(arr)) { hm.put(arr, hm.getOrDefault(arr, 0)+1); } else {
			 * hm.put(arr, 1); }
			 */
			hm.put(arr,hm.getOrDefault(arr, 0)+1 );
		}
		
		 System.out.println(hm);
		 
		 for (Entry<Integer, Integer> entry:hm.entrySet()) {
			 if (entry.getValue()>2) {
				 System.out.println(entry.getKey());
			 }
			 
		 }
		

	}

}
