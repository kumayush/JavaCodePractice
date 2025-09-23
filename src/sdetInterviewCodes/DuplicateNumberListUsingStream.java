package sdetInterviewCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumberListUsingStream {

	public static void main(String[] args) {
		Integer[] original ={1,2,2,4,4,4,6};
	List<Integer> ls=	Arrays.asList(original);
	Set<Integer> hs=new HashSet<>();
	ls.stream().filter(n->!hs.add(n)).collect(Collectors.toSet());
	
	System.out.println(hs);
	

	}
	}
