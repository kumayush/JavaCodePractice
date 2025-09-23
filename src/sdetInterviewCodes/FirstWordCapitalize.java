package sdetInterviewCodes;

public class FirstWordCapitalize {

	public static void main(String[] args) {
		String abc="this is a new word";
		//this is to split in respect to the whitespace character
		String[] abcSplitted=abc.split("\\s");
		StringBuilder result=new StringBuilder() ;
		for (String word:abcSplitted) {
			result.append(Character.toTitleCase(word.charAt(0)))
			.append(word.substring(1))
			.append(" ");
		}
		System.out.println(result.toString().trim());
	}

}
