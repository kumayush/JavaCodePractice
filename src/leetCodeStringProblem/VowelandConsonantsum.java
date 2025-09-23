package leetCodeStringProblem;

/*You are given a string s consisting of lowercase English letters ('a' to 'z').

Your task is to:

Find the vowel (one of 'a', 'e', 'i', 'o', or 'u') with the maximum frequency.
Find the consonant (all other letters excluding vowels) with the maximum frequency.
Return the sum of the two frequencies.

Note: If multiple vowels or consonants have the same maximum frequency, 
you may choose any one of them. If there are no vowels or no consonants in the 
string, consider their frequency as 0.

The frequency of a letter x is the number of times it occurs in the string.*/
public class VowelandConsonantsum {

	public int maxFreqSum(String s) {
        // Array to store frequency count of each letter (a-z)
        int[] frequencyCount = new int[26];
      
        // Count the frequency of each character in the string
        for (char character : s.toCharArray()) {
            frequencyCount[character - 'a']++;
        }
      
        // Variables to track maximum frequency among vowels and consonants
        int maxVowelFrequency = 0;
        int maxConsonantFrequency = 0;
      
        // Iterate through the frequency array to find max frequencies
        for (int i = 0; i < frequencyCount.length; i++) {
            char currentChar = (char) (i + 'a');
          
            // Check if current character is a vowel
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || 
                currentChar == 'o' || currentChar == 'u') {
                // Update maximum vowel frequency if current is greater
                maxVowelFrequency = Math.max(maxVowelFrequency, frequencyCount[i]);
            } else {
                // Update maximum consonant frequency if current is greater
                maxConsonantFrequency = Math.max(maxConsonantFrequency, frequencyCount[i]);
            }
        }
      
        // Return the sum of maximum vowel frequency and maximum consonant frequency
        return maxVowelFrequency + maxConsonantFrequency;
    }
	
	public static void main(String[] args) {
        VowelandConsonantsum obj = new VowelandConsonantsum();

        System.out.println(obj.maxFreqSum("banana"));   // a=3 (vowel), n=2 (consonant) → 5
        System.out.println(obj.maxFreqSum("apple"));    // a=1, e=1 (vowels max=1), p=2 (consonant max=2) → 3
        System.out.println(obj.maxFreqSum("xyz"));      // vowels=0, consonant max=1 → 1
        System.out.println(obj.maxFreqSum("aeiou"));    // vowels max=1, consonants=0 → 1
    }
}