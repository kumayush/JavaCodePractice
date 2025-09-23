package sdetInterviewCodes;

public class StringReverseWhiteSpacePreserve2 {
public static String reverseWhiteSpace(String str) {
	char[] originial=str.toCharArray();
	char[] newArr=new char[originial.length];
	int j=newArr.length-1;
	for (int i=0;i<originial.length;i++) {
		if (originial[i]==' ') {
			newArr[i]=originial[i];
		}
	}
	
	for (int i=0;i<originial.length;i++) {
		if (originial[i]!=' ') {
		//if (newArr[j]==' ')	{
		//	j--;
		//}
		//line no 16 to 18 will not work if there are multiple spaces 
		//in the string .
			while (newArr[j]==' '&& j>0) {
				j--;
			}
		newArr[j]=originial[i];
		j--;
		}
	}
	
	return String.valueOf(newArr);
	
	
	
}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc   de";
		System.out.println(reverseWhiteSpace(str));

	}

}
