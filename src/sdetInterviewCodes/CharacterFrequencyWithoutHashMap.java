package sdetInterviewCodes;

public class CharacterFrequencyWithoutHashMap {

	public static void main(String[] args) {
        String str = "hello world";
        int[] freq = new int[256];  // ASCII size

        // Count characters
        for (int i = 0; i < str.length(); i++) {
        	//Java implicitly converts (char → int)
            freq[str.charAt(i)]++;
        }

        // Print frequency
        System.out.println("Character Frequency:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }
    }
}

//optimize code to prevent print loop to run 256 times

/*
 * public class CharacterFrequencyWithoutHashMap {
 * 
 * public static void main(String[] args) { String str = "hello world"; int[]
 * freq = new int[256]; boolean[] visited = new boolean[256];
 * 
 * for (int i = 0; i < str.length(); i++) { int ch = str.charAt(i); freq[ch]++;
 * visited[ch] = true; }
 * 
 * for (int i = 0; i < str.length(); i++) { int ch = str.charAt(i); if
 * (visited[ch]) { System.out.println((char) ch + " : " + freq[ch]); visited[ch]
 * = false; // prevent duplicate printing } } } }
 */
