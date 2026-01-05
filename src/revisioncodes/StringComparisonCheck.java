package revisioncodes;

public class StringComparisonCheck {
	
public boolean StringComparison(String a,String b) {
	String object1=new String(a);
    String object2=new String(b);

return object1.equals(object2);

	
}
	public static void main(String[] args) {
		StringComparisonCheck sc=new StringComparisonCheck();
		System.out.println(sc.StringComparison("ayush", "piyush"));
		
	}

}
