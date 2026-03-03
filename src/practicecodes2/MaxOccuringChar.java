package practicecodes2;

public class MaxOccuringChar {

	public static void main(String[] args) {
		String str="test string";
		int count[]=new int[256];
		int max=-1;
		char res=' ';
		for (int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		for (int i=0;i<str.length();i++) {
			if (count[str.charAt(i)]>max) {
				max=count[str.charAt(i)];
				res=str.charAt(i);
			}
		}

		System.out.println("maximum count is "+max);
		System.out.println("resulting char is  "+res);
		
	}

}
