package practicecodes;

public class SwapFirstLast {

    public static String swapFirstLast(String str) {

        // If string length is 0 or 1, no swap needed
        if (str == null || str.length() <= 1) {
            return str;
        }

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        // Middle part of the string
        String middle = str.substring(1, str.length() - 1);

        return last + middle + first;
    }

    public static void main(String[] args) {
        String input = "Hello";
        System.out.println("Original String: " + input);
        System.out.println("After Swap: " + swapFirstLast(input));
    }
}