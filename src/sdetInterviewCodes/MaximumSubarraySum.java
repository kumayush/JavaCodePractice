package sdetInterviewCodes;

public class MaximumSubarraySum {
	
	    static int maxSubarraySum(int[] arr) {
	        int res = arr[0];
	  
	        // Outer loop for starting point of subarray
	        for (int i = 0; i < arr.length; i++) {
	            int currSum = 0;
	      
	            // Inner loop for ending point of subarray
	            for (int j = i; j < arr.length; j++) {
	                currSum = currSum + arr[j];
	              
	                // Update res if currSum is greater than res
	                res = Math.max(res, currSum);
	            }
	        }
	        return res;
	    }
	public static void main(String[] args) {
		 int[] arr = {7, 8, -8, 7};
	        System.out.println(maxSubarraySum(arr));

	}
	}
	



