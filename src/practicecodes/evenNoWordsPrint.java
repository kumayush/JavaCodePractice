package practicecodes;

public class evenNoWordsPrint {

	public static void main(String[] args) {
		String str="Even no of words to print inte console";
	String[] extracted=	str.split(" ");
	int [] arrayLength=new int[extracted.length];
	for(int i=0;i<extracted.length;i++) {
		arrayLength[i]=extracted[i].length();
		if (arrayLength[i]%2==0) {
			System.out.println(extracted[i]);
		}
	}
	
		

	}

}
