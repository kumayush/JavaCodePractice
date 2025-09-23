package sdetInterviewCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class anagramgroup {

	public static void main(String[] args) {
		String[] words = {"tea","eat","ate","bat","tab","abc"};
		 Map<String, List<String>> map = new HashMap<>();
for (String word:words) {
	char[] ch=word.toCharArray();
	Arrays.sort(ch);
	String key=new String(ch);
	if(!map.containsKey(key)) {
		map.put(key,new ArrayList<>());
	}
	map.get(key).add(word);
}

System.out.println(map);
System.out.println((map.values()));
	}

}
