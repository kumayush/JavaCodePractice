package practicecodes2;

public class SubstringInMiddle {

    public static void main(String[] args) {
        String mainString = "helloworld";
        String subString = "lowo";

        if (isSubstringInMiddle(mainString, subString)) {
            System.out.println("Substring appears in the middle.");
        } else {
            System.out.println("Substring does not appear in the middle.");
        }
    }

    public static boolean isSubstringInMiddle(String mainStr, String subStr) {
        int index = mainStr.indexOf(subStr);

        if (index == -1) {
            return false; // Substring not found
        }

        int leftLength = index;
        int rightLength = mainStr.length() - (index + subStr.length());

        return Math.abs(leftLength - rightLength) <= 1;
    }
}