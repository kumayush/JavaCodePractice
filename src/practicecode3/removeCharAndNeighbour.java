package practicecode3;

public class removeCharAndNeighbour {
	public static String remove(String str,char ch) {
		boolean [] marked=new boolean[str.length()];
		String result="";
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				marked[i]=true;
				if(i>0) {
					marked[i-1]=true;
				}
				if(i<str.length()-1) {
					marked[i+1]=true;
				}
			}
			
			
		}
		for (int i=0;i<str.length();i++) {
			if(!marked[i]) {
				result=result+str.charAt(i);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		String input = "test#";

        String output = remove(input, '#');

        System.out.println("Output: " + output);
	}

}
