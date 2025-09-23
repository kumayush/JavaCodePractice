package practicecodes;

import java.util.Arrays;

public class ArraySecond {

	public static void main(String[] args) {
		int [] arr={1,2,5,4,5};
        //int [] arr2=[5];
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
            	
                if (arr[j]<arr[j+1]){
                	int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

	}
            

}
       String newarr=Arrays.toString(arr);
 char Output=newarr.charAt(1);
 System.out.println(Output);
       
        
        }
}
