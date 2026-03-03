package comparatorPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AgeComparisonusingComparator {


		public static void main(String[] args) {

	        List<Student> list = new ArrayList<>();
	        list.add(new Student(20));
	        list.add(new Student(18));
	        list.add(new Student(22));

	        Collections.sort(list, new AgeComparator());

	        for (Student s : list) {
	            System.out.println(s.age);
	        }
	    }
	}