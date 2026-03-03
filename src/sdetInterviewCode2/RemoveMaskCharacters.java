package sdetInterviewCode2;

public class RemoveMaskCharacters {

	public static void main(String[] args) {
		
		        String str = "the quick brown fox";
		        String mask = "queen";

		        StringBuilder result = new StringBuilder();

		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);

		            if (mask.indexOf(ch) == -1) {
		                result.append(ch);
		            }
		        }

		        System.out.println("New string: " + result.toString());
		    }
		

	}


