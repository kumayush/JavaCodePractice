package practicecodes2;

public class Duplicatechar {

	public static void main(String[] args) {
		String input="abcd";
		String output="";
		for (int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			output=output+ch+ch;
		}
		
		System.out.println(output);

	}

}
