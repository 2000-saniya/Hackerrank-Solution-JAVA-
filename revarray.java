import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class revarray { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
    
        for (int i = 0; i<n; i++) {

            arr[i]=scanner.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        
        scanner.close();
    }
}
