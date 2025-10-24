package sdetInterviewCodes;

public class StringSplitandReverserWithSpecialcharintact {

	public static String reverseWordsKeepSpecialChars(String input) {
		StringBuilder result=new StringBuilder();
		StringBuilder currentWord=new StringBuilder();
		for (int i=0;i<input.length();i++) {
			char c=input.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				currentWord.append(c);
			}
			else {
				if (currentWord.length()>0) {
					result.append(currentWord.reverse());
					currentWord.setLength(0);
					result.append(c);
				}
				
			}
			
			
		}
		if (currentWord.length()>0) {
			result.append(currentWord.reverse());
		}
		
		return result.toString();
	}
	public static void main(String[] args) {
		String input="Hello,Java!ab";
		String result=reverseWordsKeepSpecialChars(input);
		System.out.println(result);

	}

}
