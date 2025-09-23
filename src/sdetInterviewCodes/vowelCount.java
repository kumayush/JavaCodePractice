package sdetInterviewCodes;

public class vowelCount {

	public static void main(String[] args) {
		String ref="aeiouAEIOU";
		String abc="aeIooooooRst";
		int vow=0;
		int con=0;
		for(int i=0;i<abc.length()-1;i++) {
			if((abc.charAt(i)>='A'&&abc.charAt(i)<='Z')||
			(abc.charAt(i)>='a'&&abc.charAt(i)<='z')) {
				if(ref.indexOf(abc.charAt(i))!=-1) {
					vow++;
				}
				else
					con++;
					
			}
		}
		
		 System.out.println("Number of Vowels = " + vow
                 + "\nNumber of Consonants = "
                 + con);
	}

}
