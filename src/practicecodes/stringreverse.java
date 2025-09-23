package practicecodes;

public class stringreverse {

	 
 
	public static void main(String[] args) {
		String input="hi my name";
	String [] splittedString=input.split(" ");
	String result="";
	for (String word:splittedString) {
		String reversed="";
		for (int i=word.length()-1;i>=0;i--) {
			reversed+=word.charAt(i);
		}
		
		result+=reversed+" ";
	}
	
	
	
System.out.println(result.strip());
	}

}
