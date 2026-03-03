package sdetInterviewCode2;

import java.util.Arrays;

public class StreamUse {

	public static void main(String[] args) {
		String [] arr={"Java", "Selenium", "Jenkins", "Jar"};
		Arrays.stream(arr).filter(s->s.startsWith("J")).forEach(System.out::println);

	}

}
