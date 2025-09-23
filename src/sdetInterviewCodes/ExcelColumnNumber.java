package sdetInterviewCodes;

public class ExcelColumnNumber {

	public static int getColNumber(String abc) {
		int result=0;
		for (int i=0;i<abc.length();i++) {
		char ch=abc.charAt(i);
		int value=(ch-'A')+1;
		result=result*26+value;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("Number for Z: " + getColNumber("Z"));   // 26
        System.out.println("Number for AA: " + getColNumber("AA")); // 27
        System.out.println("Number for AZ: " + getColNumber("AZ")); // 52
        System.out.println("Number for BA: " + getColNumber("BA")); // 53
        System.out.println("Number for A: " + getColNumber("A")); 

	}

}
