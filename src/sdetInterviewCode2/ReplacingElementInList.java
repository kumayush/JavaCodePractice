package sdetInterviewCode2;

import java.util.ArrayList;

public class ReplacingElementInList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Test1");

        list.add("Test1");

        list.add("Test2");

        list.add("Test3");

        list.add("Test4");
        
        System.out.println("ArrayList before Replace");

        System.out.println(list);
       int index= list.indexOf("Test3");
list.set(index, "replaced text");
System.out.println("\nArrayList after Replace");

System.out.println(list);
	}

}
