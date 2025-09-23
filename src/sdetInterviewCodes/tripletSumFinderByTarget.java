package sdetInterviewCodes;

public class tripletSumFinderByTarget {

    public static void main(String[] args) {
        // Our array
        int[] a = {2, 3, 5, 6, 7, 9};

        // Let's assume target value is 10
        int target = 10;

        System.out.println("Triplets where sum of two elements equals target:");

        // Loop through all pairs
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                // Check if sum equals target
                if (a[i] + a[j] == target) {
                    System.out.println("(" + a[i] + ", " + a[j] + ", " + target + ")");
                }
            }
        }
    }
}
