package practicecodes;
import java.util.*;
public class ArraySort {
	public static int[] SortArray(int [] array) {
		System.out.println("the array is : "+Arrays.toString(array));
		int[]sortarray=Arrays.copyOf(array, array.length);
		for (int i=0;i<sortarray.length-1;i++) {
			for (int j=0;j<sortarray.length-1-i;j++) {
			if(sortarray[j]>sortarray[j+1])	{
				int temp=sortarray[j];
				sortarray[j]=sortarray[j+1];
				sortarray[j+1]=temp;
			}
	       
			
		}
		}
		return sortarray;
	}
			

	public static void  main(String[] args) {
int[] array={2,4,9,5,4,5,1};
int[]result=SortArray(array);
System.out.println(Arrays.toString(result));





	}
}
		

