package sdetInterviewCode2;

public class ExtractNumbers {

	public static void main(String[] args) {
		String sentence="Order IDs are 105, 67 and 8901";
		String temp="";
		for (int i=0;i<sentence.length();i++) {
			char ch=sentence.charAt(i);
			if(Character.isDigit(ch)) {
				temp=temp+ch;
			}
			else {
				if (!temp.equals("")) {
					System.out.println(temp);
					temp="";
				}
			}	
		}
		if (!temp.equals("")) {
			System.out.println(temp);	
		}
		
		
	}

}
