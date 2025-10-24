package sdetInterviewCodes;

public class StringReverserSpecialCharPositionIntact {
	
	public static String reverseStringSpecialCharIntact(String str) {
		char[] arr=str.toCharArray();
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(!Character.isLetter(arr[left])) {
				left++;
			}
			
			else if(!Character.isLetter(arr[right])) {
				right--;
			}
			
			else {
				char temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
				
		}
		
		return new String(arr);
	}

	public static void main(String[] args) {
		
		System.out.println(reverseStringSpecialCharIntact("Abc@def!"));
		System.out.println(reverseStringSpecialCharIntact("abc  de"));

	}

}
