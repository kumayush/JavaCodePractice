package practicecode3;

public class ReplacingSubtringWithAnother {

	public static void main(String[] args) {
		//String input="this is a beautiful place ";
		String input="this";
		StringBuilder result=new StringBuilder();
		for (int i=0;i<input.length();i++) {
			if(i<input.length()-1&&input.charAt(i)=='i'&&input.charAt(i+1)=='s') {
				result.append("isnot");
				i++;
			}
			else {
				result.append(input.charAt(i));
			}
		}
		
		System.out.println(result.toString());
		
		
		
		
		
		//a more cleaner way to write this where 
		//we are manually incrementing the i inside the code
		
		
		String str = "This";
        StringBuilder resultnew = new StringBuilder();

        for (int i = 0; i < str.length(); ) {

            // Check if "is" is found
            if (i < str.length() - 1 &&
                str.charAt(i) == 'i' &&
                str.charAt(i + 1) == 's') {

            	resultnew.append("is not");
                i += 2;   // Skip both characters 'i' and 's'
            } 
            else {
            	resultnew.append(str.charAt(i));
                i++;      // Move one step normally
            }
        }

        System.out.println("Original: " + str);
        System.out.println("Modified: " + resultnew.toString());

	}

}
