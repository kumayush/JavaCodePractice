package revisioncodes;

public class CompareTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,3,5,8};
		int[] b= {1,2,3,9,6,9};
		boolean res=true;
		if (a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if (a[i]!=b[i]) {
					res=false;
					break;
				}
				
					
			}
		}
		else {
			res=false;	
		}
		
		if (res) {
			System.out.println("array are equal");
		}
		else {
			System.out.println("array are not equal");
		}
		

	}

}
