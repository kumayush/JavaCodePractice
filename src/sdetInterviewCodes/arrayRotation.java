package sdetInterviewCodes;

public class arrayRotation {

	 public static void rotateclockwise(int[] arr, int k) {
	        int n = arr.length;

	        // If rotation is greater than array size
	        k = k % n;

	        // Temporary array to store rotated elements
	        int[] res = new int[n];

	        for (int i = 0; i < n; i++) {
	            if (i < k) {
	                // Place last k elements at the beginning
	                res[i] = arr[n + i - k];
	            } 
	            else {
	                // Shift the rest
	                res[i] = arr[i - k];
	            }
	        }

	        // Copy back to original array (in-place update)
	        for (int i = 0; i < n; i++) {
	            arr[i] = res[i];
	        }
	    }

	    public static void main(String[] args) {
	        
	        int[] arr = {1, 2, 3, 4, 5, 6};
	        int k = 2;
	        
	        rotateclockwise(arr, k);
	        for (int it : arr) {
	            System.out.print(it + " ");
	        }
	    }
}
