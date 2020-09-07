import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FindIndex{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i <n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==V){
                System.out.print(i);
            }
        }
    }
}
