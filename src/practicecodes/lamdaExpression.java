package practicecodes;

import java.util.ArrayList;

public class lamdaExpression {

	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		
		a1.forEach(n-> System.out.println(n));
		
		a1.forEach(n->{if (n%2==0) System.out.println(n);});

}
}
