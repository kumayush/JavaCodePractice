package practicecode3;

public class SubStringBetweenTwoToast {
public static String  getMiddle(String str) {
	String word="toast";
	int first=-1;
	int last=-1;
	for (int i=0;i<=str.length()-word.length();i++) {
		if((str.substring(i,i+5)).equals(word)) {
			if (first==-1) {
				first=i;
			}
			last=i;
		}
	}
	
	if(first==-1||first==last) {
		return "";
	}
	
	int start=first+word.length();
	return str.substring(start, last);
}
	public static void main(String[] args) {
		String input = "sweettoastbuttertoast";
		String output=SubStringBetweenTwoToast.getMiddle(input);
		System.out.println(output);

	}

}
