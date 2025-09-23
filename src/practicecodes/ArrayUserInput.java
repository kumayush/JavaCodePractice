package practicecodes;
import java.util.*;
public class ArrayUserInput {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the total no you want to use to create the array");
		int totalitems=sc.nextInt();
int[] array=new int[totalitems];
for(int i=0;i<totalitems;i++) {
	System.out.println("enter the :"+" "+i+" "+"number");
	array[i]=sc.nextInt();
}
System.out.println("the array is : "+Arrays.toString(array));
System.out.println("enter the number you wnat to verify");
int number=sc.nextInt();
boolean found=false;
for (int ele:array) {
	if (ele==number) {
		System.out.println("number exists in the array");
		found=true;
		break;
	}
}
	
	if(!found) {
		System.out.println("number does not exist in the array");
	}
	

		
}
	}

		

