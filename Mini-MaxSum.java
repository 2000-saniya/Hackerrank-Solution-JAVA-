import java.io.*;
import java.util.*;
import java.util.Arrays;


public class Mini-MaxSum {

    public static void main(String[] args) {
        
        int min,max;
        int sum=0;
        
        Scanner scanner = new Scanner(System.in);
 
        int[] arr = new int[5];
        int maxnumber;
        int minnumber;

        for (int i = 0; i < 5; i++)
        {
           arr[i]=scanner.nextInt();
           sum=sum+arr[i];  
        }
       
           Arrays.sort(arr);
           minnumber=arr[0];
           maxnumber=arr[4];
           max=sum-minnumber;
           min=sum-maxnumber;
       
        System.out.println(min+ " " +max);

        scanner.close();
    }
}
