package practicecodes2;

public class AlternateCharFromTwoString {

	public static void main(String[] args) {
		 String str1 = "welcome";
	        String str2 = "w3resource";
	        String result = "";
	        int maxlength=Math.max(str1.length(), str2.length());
	        for (int i=0;i<maxlength;i++) {
	        	if (i<str1.length()) {
	        		result=result+str1.charAt(i);
	        	}
	        	if (i<str2.length()) {
	        		result=result+str2.charAt(i);
	        	}
	        }
	        
	        System.out.println(result);

	}

}
