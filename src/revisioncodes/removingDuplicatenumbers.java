package revisioncodes;

import java.util.ArrayList;
import java.util.Scanner;

public class removingDuplicatenumbers {
	public static ArrayList<Integer> rempoveduplicate(ArrayList<Integer> array) {
	int sizeofarray=array.size();
	ArrayList<Integer>uniquelist=new ArrayList<>() ;
	for(int i=0;i<sizeofarray-1;i++) {
		boolean isDuplicate=false;
		for(int j=0;j<uniquelist.size();j++) {
		if(uniquelist.get(j)==array.get(i))	{
			isDuplicate=true;
			break;
		}
		}
		if(!isDuplicate) {
			uniquelist.add(array.get(i));
		}
		
		
	}
	return uniquelist;
	
	}
	

	public static void main(String[] args) {
		System.out.println("enter the total numbers: ");
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>	array	=new ArrayList<>();
		int totalInput=sc.nextInt();
		for (int i=1;i<totalInput+1;i++) {
			System.out.println("enter the number:"+""+ i);
			int number=sc.nextInt();
			array.add(number);
			
		}
		System.out.println("original list is :"+array);
		
		rempoveduplicate(array);
		
		System.out.println("new list is :"+rempoveduplicate(array));

	}

}
