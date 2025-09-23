package interview;

import java.util.HashMap;

public class StringPractice {

	public static void main(java.lang.String[] args) {
		String name="KumarAyush";
		String smallLet=name.toLowerCase();
		HashMap<Character,Integer> hm=new HashMap<>();
		
		for (int i=0;i<smallLet.length();i++) {
			if(hm.containsKey(smallLet.charAt(i))) {
				hm.put(smallLet.charAt(i),hm.getOrDefault(smallLet.charAt(i), 0)+1);
			}
			
			else {
				hm.put(smallLet.charAt(i), 1);
			}
		}
		
		System.out.println(hm);
		
		
		
		

	}

}
