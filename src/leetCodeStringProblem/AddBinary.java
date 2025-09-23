package leetCodeStringProblem;

public 	class AddBinary {
	    public String addBinary(String a, String b) {
	       StringBuilder result=new StringBuilder() ;
	       int indexA=a.length()-1;
	       int indexB=b.length()-1;
	       int carry=0;
	       while(indexA>=0||indexB>=0||carry>0){
	        int digitA;
	        int digitB;
	        if (indexA>=0){
	            digitA=a.charAt(indexA)-'0';
	        }
	        else {
	           digitA=0; 
	        }
	        
	        if (indexB>=0){
	            digitB=b.charAt(indexB)-'0';
	        }
	        else {
	           digitB=0; 
	        }
	        int sum=digitA+digitB+carry;
	        result.append(sum%2);
	        indexA--;
	        indexB--;
	        carry=sum/2;

	       }
	       return result.reverse().toString();
	    }
	

	public static void main(String[] args) {
		AddBinary ab=new AddBinary();
		String a="11";
		String b="1";
		String result=ab.addBinary(a, b);
		System.out.println(result);

	}

}
