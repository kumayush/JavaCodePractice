package practicecodes;
import java.util.*;
public class ArrayLargest {
	public static int largestArrayfn(int [] array) {
		System.out.println("the array is : "+Arrays.toString(array));
		int max=array[0];
		for (int i=0;i<array.length;i++) {
			
			if(array[i]>max) {
				max=array[i];
				
			}
		}
	
		return max;	
	}

	public static void  main(String[] args) {
int[] array={1,2,3,4,5,6};
int result=largestArrayfn(array);
System.out.println(result);





	}
}
		

