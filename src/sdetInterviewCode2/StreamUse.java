package sdetInterviewCode2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamUse {

	public static void main(String[] args) {
		String [] arr={"Java", "Selenium", "Jenkins", "Jar"};
		Arrays.stream(arr).filter(s->s.startsWith("J")).forEach(System.out::println);
//alternate way
		Arrays.stream(arr).filter(s->s.startsWith("J")).forEach(s->System.out.println(s));
		System.out.println(Arrays.stream(arr).filter(a->a.startsWith("J")).collect(Collectors.toList()));
	}

}
