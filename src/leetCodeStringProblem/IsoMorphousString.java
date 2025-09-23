package leetCodeStringProblem;

import java.util.HashMap;

public class IsoMorphousString {
	public static boolean isIsoMorph(String s1,String s2) {
		HashMap<Character,Integer> hm1=new HashMap<>();
		HashMap<Character,Integer> hm2=new HashMap<>();
		for (int i=0;i<s1.length();i++) {
			if (!hm1.containsKey(s1.charAt(i))) {
				hm1.put(s1.charAt(i), i);
			}
			if (!hm2.containsKey(s2.charAt(i))) {
				hm2.put(s2.charAt(i), i);
			}
			
			if (!hm1.get(s1.charAt(i)).equals(hm2.get(s2.charAt(i)))) {
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		String s1="aab";
		String s2="xxy";
		
		if (isIsoMorph(s1,s2)) {
			 System.out.println("true");
		}
		
		else {
			 System.out.println("false");
		}

	}

}
