package practicecodes;

import java.io.*;
import java.util.*;

public class SubArraySum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int sum =0,count=0;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] array = new int[number];
        for(int counter=0;counter<number;counter++)
        {
            array[counter]=scan.nextInt();
        }
        scan.close();
        for(int i=0;i<number;i++)
        {
            sum =0;
            for(int j=i;j<number;j++)
            {
                sum = sum + array[j];
                if(sum<0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}