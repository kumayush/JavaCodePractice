package leetCodeStringProblem;

import java.util.HashMap;
import java.util.Map;

/*Given a pattern and a string s, find if s follows the same pattern. 
Here follow means a full match, 
such that there is a bijection between 
a letter in pattern and a non-empty word in s. Specifically:
Each letter in pattern maps to exactly one unique word in s. 
Each unique word in s maps to exactly one letter in pattern. 
No two letters map to the same word, and no two words map to the same letter.
Example 1: Input: pattern = "abba", s = "dog cat cat dog" 
Output: true Explanation: The bijection can be established as: 'a' maps to "dog".
 'b' maps to "cat".
Example 2: Input: pattern = "abba", s = "dog cat cat fish" Output: false 
Example 3: Input: pattern = "aaaa", s = "dog cat cat dog" Output: false*/

public class WordPattern {

	public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // If char is already mapped
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false; // mismatch
                }
            } else {
                charToWord.put(c, word);
            }

            // If word is already mapped
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c) {
                    return false; // mismatch
                }
            } else {
                wordToChar.put(word, c);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        WordPattern solution = new WordPattern();

        System.out.println(solution.wordPattern("abba", "dog cat cat dog"));  // true
        System.out.println(solution.wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(solution.wordPattern("aaaa", "dog cat cat dog"));  // false
    }
}