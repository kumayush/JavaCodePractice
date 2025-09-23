package practicecodes;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListCommonElement {

	public static void main(String[] args) {
		ArrayList<String> arlist=new ArrayList();
arlist.add("a");
arlist.add("b");
arlist.add("c");
arlist.add("a");
arlist.add("b");

ArrayList<String> arlist2=new ArrayList();

arlist2.add("b");
arlist2.add("c");
arlist2.add("d");
System.out.println(arlist.stream().filter(arlist2::contains).collect(Collectors.toList()));

//removing duplicates element from the list
System.out.println(arlist.stream().distinct().collect(Collectors.toList()));

	}

}
