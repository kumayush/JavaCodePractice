package practicecodes2;

public class InterleavingStrings {

    public static void interleave(String s1, String s2, String result) {
        
        // If both strings are empty, print result
        if (s1.length() == 0 && s2.length() == 0) {
            System.out.println(result);
            return;
        }

        // If first string is not empty, take one character from it
        if (s1.length() > 0) {
            interleave(s1.substring(1), s2, result + s1.charAt(0));
        }

        // If second string is not empty, take one character from it
        if (s2.length() > 0) {
           interleave(s1, s2.substring(1), result + s2.charAt(0));
        }
    }

    public static void main(String[] args) {
        String s1 = "WX";
        String s2 = "YZ";
        interleave(s1, s2, "");
    }
}
