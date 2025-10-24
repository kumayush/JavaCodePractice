package sdetInterviewCodes;

public class EvenNumbersRecursive {

    public static void main(String[] args) {
        printEvenNumbers(50);
    }

    private static void printEvenNumbers(int currentNumber) {
        if (currentNumber > 100) {
            return; // Base case: stop recursion when currentNumber exceeds 100
        }

        if (currentNumber % 2 == 0) {
            System.out.println(currentNumber); // Print if it's an even number
        }

        printEvenNumbers(currentNumber + 1); // Recursive call to check the next number
    }
}