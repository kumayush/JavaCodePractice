package sdetInterviewCode2;

public class ProductExceptSelf {

	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int product = 1;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }

            System.out.print(product + " ");
        }
    }
}