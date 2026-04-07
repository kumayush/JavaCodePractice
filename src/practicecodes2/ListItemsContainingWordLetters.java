package practicecodes2;

import java.util.HashMap;

public class ListItemsContainingWordLetters {

	public static boolean checkExistence(String item,String word) {
		 HashMap<Character, Integer> map = new HashMap<>();

	        // Count characters of item
	        for (char c : item.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        // Check characters of word
	        for (char c : word.toCharArray()) {
	            if (!map.containsKey(c) || map.get(c) == 0) {
	                return false;
	            }
	            map.put(c, map.get(c) - 1); // reduce count
	        }

	        return true;
	    }
	public static void main(String[] args) {
		String[] items = {"rabbit", "bribe", "dog"};
        String word = "bib";
        for (int i = 0; i < items.length; i++) {
            if (checkExistence(items[i], word)) {
                System.out.println(items[i]);
            }
        }

	}

}
