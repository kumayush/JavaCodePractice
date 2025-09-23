package practicecodes2;

import java.util.Arrays;

public class RemoveElementsOccurrencesinArray {
	public static int[] removeElements(int[] a, int k) 
    { 
        // Move all other elements to beginning 
        int ind = 0; 
        
        for (int i=0; i<a.length; i++) {
        	if (a[i] != k) {
                a[ind] = a[i]; 
                 ind++;
       
    }
        }
            
        return Arrays.copyOf(a,ind);
        
    }

    // Driver code 
    public static void main(String[] args) 
    { 
        int [] a = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }; 
        int k = 3; 
        int[] b = removeElements(a, k); 
        System.out.println(Arrays.toString(b));
        
         
    } 
}


