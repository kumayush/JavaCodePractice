package revisioncodes;

import java.util.ArrayList;
import java.util.Scanner;

public class removingDuplicatenumbers2 {
	public static ArrayList<Integer> rempoveduplicate(int[] arr) {
		ArrayList<Integer> result=new ArrayList<Integer>();
		for (int i=0;i<arr.length;i++) {
			if (!result.contains(arr[i])) {
				result.add(arr[i]);
			}
		}
		return result;
	}
	
	

	public static void main(String[] args) {
		int[] arr= {1,2,6,2,4,2,4};
		System.out.println(rempoveduplicate(arr));
	}
		

}
