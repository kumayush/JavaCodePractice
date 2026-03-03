package stringComplexProblems;

public class RepeatSeparator {

	 public static String repeatWithSeparator(String mainStr, String sep, int count) {

	        String result = "";

	        for (int i = 0; i < count; i++) {
	            result = result + mainStr;

	            if (i != count - 1) {   // add separator except last time
	                result = result + sep;
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {

	        String mainStr = "try";
	        String sep = "best";
	        int count = 3;

	        String output = repeatWithSeparator(mainStr, sep, count);

	        System.out.println(output);
	    }
	}
