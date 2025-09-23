package revisioncodes;

public class ReverseAlphabetSegments {
    public static void main(String[] args) {
        String input = "abc12qrt234qwert12345sdfg";
        String output = reverseAlphabetSegments(input);
        System.out.println(output); 
    }

    public static String reverseAlphabetSegments(String str) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                temp.append(ch); // Collect letters
            } else {
                result.append(temp.reverse()); // Reverse the collected letters
                temp.setLength(0); // Clear the temp buffer
                result.append(ch);
                // Append the non-letter (digit)
            }
        }
        
       result.append(temp.reverse()); // Reverse and append the last letter segment
        return result.toString();
        
        //Alternate and most concise approach
//        public static String reverseAlphabetSegments(String str) {
//            return Pattern.compile("[a-zA-Z]+")
//                    .matcher(str)
//                    .replaceAll(m -> new StringBuilder(m.group()).reverse().toString());
        
    }
}