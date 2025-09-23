package practicecodes;

import java.util.ArrayList;
import java.util.List;

public class arraylistToList {

	public static void main(String[] args) {
	ArrayList<String> arrString=new ArrayList<>();
	arrString.add("1");
	arrString.add("ay");
	arrString.add("b");
	arrString.add("c");
	System.out.println(arrString);
	List<String> list=arrString;
	System.out.println(list);

	}

}
