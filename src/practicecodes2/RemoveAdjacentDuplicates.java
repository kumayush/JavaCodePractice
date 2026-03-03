package practicecodes2;

/*Write a Java program to remove all adjacent duplicates recursively from a given string.

Sample Output:

The given string is: aabaarbarccrabmq
The new string after removing all adjacent duplicates is:
brmq*/
public class RemoveAdjacentDuplicates {

	public static String removeDuplicates(String str) {
        if (str.length() <= 1) return str;

        StringBuilder result = new StringBuilder();
        boolean hasDuplicate = false;

        for (int i = 0; i < str.length(); i++) {
            // Check if current char is same as next
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                hasDuplicate = true;
                // Skip all same adjacent characters
                while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    i++;
                }
            } else {
                result.append(str.charAt(i));
            }
        }

        // If duplicates were found, recurse again
        if (hasDuplicate) {
            return removeDuplicates(result.toString());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "aabaarbarccrabmq";
        System.out.println(removeDuplicates(input));  // brmq
    }
}