package sdetInterviewCodes;

import java.util.HashSet;

public class UniqueVowelCount {

	public static void main(String[] args) {
		String name="my name is kumar ayush";
		name=name.toLowerCase();
		HashSet<Character> hs=new HashSet<>();
		for(char c:name.toCharArray()) {
			if("aeiou".indexOf(c)!=-1) {
				hs.add(c);
				
			}
			
		}
		
		System.out.println(hs);
		System.out.println(hs.size());

	}

}
