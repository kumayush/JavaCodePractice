package sdetInterviewCodes;

public class GenericStringReverser {
public static String reversePreserveNonLetters(String str) {
	//char[] org=str.toCharArray();
	char[] result=new char[str.length()];
	int j=str.length()-1;
	for (int i=0;i<str.length();i++) {
		if(!Character.isLetter(str.charAt(i))) {
			result[i]=str.charAt(i);
		}
	}
	for (int i=0;i<str.length();i++) {
		if (Character.isLetter(str.charAt(i))) {
			while(j>0 && !Character.isLetter(str.charAt(j))) {
				j--;
			}
			result[j]=str.charAt(i);
			j--;
		}
		
	}
	
	return new String(result);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="@!ab";
System.out.println(reversePreserveNonLetters(input));

	}

}
