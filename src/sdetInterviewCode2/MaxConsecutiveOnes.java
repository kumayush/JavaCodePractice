package sdetInterviewCode2;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int arr[]= {1,1,1,1,2,3,0,1,1,1,1,1};
		int maxcount=0;
		int currentcount=0;
	 for (int num:arr) {
		 if(num==1) {
			 currentcount++;
			 maxcount=Math.max(maxcount, currentcount);
		 }
		 else {
			 currentcount=0; 
		 }
	 }
	 
	 System.out.println(maxcount);

	}

}
