package practicecodes;
import java.util.*;
public class ArrayDuplicate {
	public static List<Integer> Removeduplicate(int [] array) {
		System.out.println("the array is : "+Arrays.toString(array));
	List<Integer> unique=new ArrayList();
	 
		for (int val:array) {
			if(!unique.contains(val)) {
				unique.add(val);
				
			}
		}
		return unique;
		
	}

	public static void  main(String[] args) {
int[] array= {1,2,5,5,8,10,2,7};
List<Integer> result=Removeduplicate(array);
System.out.println(String.valueOf(result));





	}
}
		

