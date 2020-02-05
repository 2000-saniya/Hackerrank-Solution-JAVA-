import java.io.*;
import java.util.Arrays;
import java.util.*;


public class BirthdayCakeCandles{

    public static void main(String[] args)  {
       Scanner scanner = new Scanner(System.in);
        
        int count=0;
        int arCount = scanner.nextInt();
        int[] ar = new int[arCount];

      for (int i = 0; i < arCount; i++) 
       {
          ar[i]=scanner.nextInt();
        }
      Arrays.sort(ar);
      int maxheight=ar[arCount-1];
      for(int i=0;i<arCount;i++)
      {
          if(ar[i]==maxheight)
          {
              count++;
          }
      }
        
      System.out.println(count);
        scanner.close();
    }
}
