package sdetInterviewCode2;

import java.util.LinkedList;

public class LinkedListLstElement {

	public static void main(String[] args) {
		LinkedList<String>  list = new LinkedList<String>();
		list.add("Test1");

        list.add("Test1");

        list.add("Test2");

        list.add("Test3");

        list.add("Test4");
        
        System.out.println("LinkedList before Inserting Element at the End/Last");

        System.out.println(list);
        
        list.offerLast("LastInsertedElement");
        System.out.println("\nLinkedList after Inserting Element at the End/Last");

        System.out.println(list);

  

	}

}
