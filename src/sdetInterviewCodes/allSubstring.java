package sdetInterviewCodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class allSubstring {

    public static ArrayList<String> printAllSubstrings(String input) {
    	//Set<String> substrings = new HashSet<>();
    	
    	ArrayList<String> substrings=new ArrayList<>();
        int length = input.length();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
            	substrings.add(input.substring(i,j));
                
            }
        }
        return substrings;
    }

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> result=printAllSubstrings(str);
        System.out.println(result);
    }
}