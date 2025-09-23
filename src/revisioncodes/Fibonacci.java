package revisioncodes;

public class Fibonacci {
	public static void fibonaci(int n) {
		
		int a=0;
		int b=1;
	      int c=a+b;
	for(int i=1;i<=n;i++) {
		System.out.print(a+" ");
		a=b;
		b=c;
		c=a+b;
		
		
	}
		
	}

	public static void main(String[] args) {
		fibonaci(1);
		// TODO Auto-generated method stub

	}

}
