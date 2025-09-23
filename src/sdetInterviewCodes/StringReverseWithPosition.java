package sdetInterviewCodes;

public class StringReverseWithPosition {

	public static void main(String[] args) {
	
	//	This is string 
	//	sihT si gnirts
		String input="This is string";
String[] splitted =	input.split(" ");
StringBuilder result=new StringBuilder();
for (String word:splitted) {
	StringBuilder sb=new StringBuilder(word);
	result.append(sb.reverse()).append(" ");
}
System.out.println(result.toString().trim());	
	}
}

