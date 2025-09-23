package practicecodes;

import java.util.HashMap;

public class DistinctCharCount {

	public static void main(String[] args) {
		String str="aAaaaBcdDDE";
	char[]	ch=str.toCharArray();
	HashMap<Character,Integer> hm=	new HashMap();
	for (char c:ch) {
		if(hm.containsKey(c)) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		else {
			hm.put(c,1);
		}
			
	}
	
	
	System.out.println(hm);

	}

}
