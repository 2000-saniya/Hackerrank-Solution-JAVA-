import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LetReview

 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     sc.nextLine();
     while(n>0)
     {
         String str=sc.nextLine();
         char arr[]=str.toCharArray();
         int len=str.length();
         for(int i=0;i<len;i=i+2)
         {
             System.out.print(arr[i]);
         }
         System.out.print(" ");
         for(int i=1;i<len;i=i+2)
         {
             System.out.print(arr[i]);
         }
         System.out.println();
         n--;
     }
  }
}
     