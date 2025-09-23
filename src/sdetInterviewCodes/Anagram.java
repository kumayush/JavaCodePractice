package sdetInterviewCodes;

import java.util.HashMap;
import java.util.Map.Entry;

public class Anagram {
	
	public static boolean anagramcheck(String s1,String s2) {
		char[] arr=s1.toCharArray();
		char[]arr2=s2.toCharArray();
		
		if (s1.length()!=s2.length()) {
			return false;
		}
		
		HashMap<Character,Integer> hm=new HashMap<>();
		for (char ch:arr) {
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		
		for (char ch:arr2) {
			hm.put(ch, hm.getOrDefault(ch, 0)-1);
		}
		
		for(Entry<Character, Integer> ab:hm.entrySet()) {
			if (ab.getValue()!=0) {
				return false;
			}
			
			
			
		}
		
		return true;
	}

	public static void main(String[] args) {
	System.out.println(anagramcheck("ayush","huyas222"));	
	}
		}
