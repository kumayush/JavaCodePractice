package leetCodeStringProblem;

import java.util.Arrays;

/*This is a classic interview problem known as the Dutch National Flag Algorithm.
Goal: Sort an array containing only 0s, 1s, and 2s in O(n) time and O(1) space.*/
public class DutchNationalFlagAlgorithm {
	
	public static int[] sortColors(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }
	
	private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	
	


	public static void main(String[] args) {
	
		int [] arrayinput= {2, 0, 2, 1, 1, 0};
		System.out.println(Arrays.toString(sortColors(arrayinput)));

	}

}
