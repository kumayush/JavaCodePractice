package sdetInterviewCodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringTransformer {

	public static String transform(String s) {
        if (s == null || s.isEmpty()) return s;

        // 1) Count frequencies
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
           
        }

        // 2) Build result using the rule
        StringBuilder out = new StringBuilder();
        for (char c : s.toCharArray()) {
            int count = freq.get(c);
            if (count > 1) {
                out.append(count);    // count can be multi-digit (e.g., "10")
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }

    public static void main(String[] args) {
        // Read any input at runtime, or just test with samples
        String input="tomorrow";
        System.out.println(transform(input));
    }
}