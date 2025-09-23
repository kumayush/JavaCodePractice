package sdetInterviewCodes;

public class StringReverseWhiteSpacePreserve {
public static String reverseWhiteSpace(String str) {
	char[] inputArray=str.toCharArray();
	char[] newArray=new char[inputArray.length];
	int j=newArray.length-1;
	for (int i=0;i<inputArray.length;i++) {
		if (inputArray[i]==' ') {
			newArray[i]=' ';
		}
	}
	for (int i=0;i<inputArray.length;i++) {
		
		if (inputArray[i]!=' ') {
			while (j >= 0 && newArray[j] == ' ') {
			    j--;
			}
			newArray[j]=inputArray[i];
			j--;
		}
			
	}
	return String.valueOf(newArray);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc   de";
		System.out.println(reverseWhiteSpace(str));

	}

}
