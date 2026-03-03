package sdetInterviewCode2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Student class
class Student implements Comparable<Student> {
    int age;

    Student(int age) {
        this.age = age;
    }

    // compareTo method
   public int compareTo(Student s) {
       return this.age - s.age;   // ascending order
    }
}

// Main class
public class ExampleOfComparable {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(20));
        list.add(new Student(18));
        list.add(new Student(22));
        Collections.sort(list);      
        
		/*
		 * Collections.sort() does NOT sort by itself 👉 It asks your object:
		 * 
		 * “How should I compare two elements?”
		 * 
		 * That answer comes from compareTo().
		 * this compareto() comes from comparable interface
		 */

        for (Student s : list) {
            System.out.println(s.age);
        }
    }
}