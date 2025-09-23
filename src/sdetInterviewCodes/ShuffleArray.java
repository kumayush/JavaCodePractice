package sdetInterviewCodes;

import java.util.Random;

public class ShuffleArray {

    public static int[] shuffle(int[] arr) {
        Random rand = new Random();

        // Fisher–Yates shuffle
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // random index from 0 to i

            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr; // returns the shuffled array
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        int[] shuffled = shuffle(numbers);

        System.out.print("Shuffled array: ");
        for (int num : shuffled) {
            System.out.print(num + " ");
        }
    }
}