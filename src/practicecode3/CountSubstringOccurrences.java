package practicecode3;

public class CountSubstringOccurrences {

	public static void main(String[] args) {
		String mainStr = "abcd abc aabc baa abcaa";
        String subStr = "aa";
        
        int count = 0;
        int index = 0;
        
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index = index + subStr.length(); // move forward
        }
        
        System.out.println("\"" + subStr + "\" has occurred " + count + " times.");

	}

}
