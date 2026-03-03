package practicecodes2;

public class LongestSubstringWithoutRepeats {

	public static boolean isUnique(String s) {
		int count[]=new int [256];
		for (int i=0;i<s.length();i++) {
			if(count[s.charAt(i)]>0) {
				return false;
			}
			count[s.charAt(i)]++;
		}
		return true;
	}
	public static void main(String[] args) {
		 String str = "abcabcbb";

	        int maxLength = 0;
	        String longest = "";
	        for (int i = 0; i < str.length(); i++) {
	            for (int j = i + 1; j <= str.length(); j++) {

	                String sub = str.substring(i, j);
	                if (isUnique(sub) && sub.length() > maxLength) {
	                    maxLength = sub.length();
	                    longest = sub;
	                }
	            }
	        }
	        System.out.println("Longest substring: " + longest);
	        System.out.println("Length: " + maxLength);
	}

}
