package sdetInterviewCode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnmodifiableList {

	public static void main(String[] args) {
	List<String > original=Arrays.asList(new String[] {"a","b"});
	List<String> list=new ArrayList(original);
	list=Collections.unmodifiableList(list);
	Set<String> set=new HashSet(original);
	set=Collections.unmodifiableSet(set);
	Map<String,String> map=new HashMap();
	map=Collections.unmodifiableMap(map);

	}

}
