package sdetInterviewCodes;

public class CountingWordsFromSentence {

	public static void main(String[] args) {
		String abc="this is a senetence";
		int count =1;
		for (int i=0;i<abc.length();i++) {
			if (abc.charAt(i)==' ') {
				count++;
			}
		}
		 System.out.println("Total words in the sentence is "+count);
	}

}
