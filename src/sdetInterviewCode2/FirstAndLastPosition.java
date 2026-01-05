package sdetInterviewCode2;

public class FirstAndLastPosition {

	 public static void main(String[] args) {
	        int[] arr = {5, 2, 7, 2, 9, 2, 4};
	        int target = 9;

	        int first = -1;
	        int last = -1;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                if (first == -1) {
	                    first = i;   // first occurrence
	                }
	                last = i;        // last occurrence
	            }
	        }

	        if (first == -1) {
	            System.out.println("Element not found");
	        } else {
	            System.out.println("First position: " + first);
	            System.out.println("Last position: " + last);
	        }
	    }
	}