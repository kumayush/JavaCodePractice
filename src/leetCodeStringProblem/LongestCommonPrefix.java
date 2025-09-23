package leetCodeStringProblem;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];  // Take first string as reference

        for (int i = 1; i < strs.length; i++) {
            // Keep reducing prefix until it matches current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};

        System.out.println(solution.longestCommonPrefix(strs1)); // "fl"
        System.out.println(solution.longestCommonPrefix(strs2)); // ""
    }
}
