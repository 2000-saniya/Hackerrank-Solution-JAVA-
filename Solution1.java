
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        double positive = 0;
        double negative = 0;
        double zero = 0;
        
        for(int i = 0; i<n; i++)
        {
            int value = input.nextInt();
            if(value>0){positive++;}
            if(value<0){negative++;}
            if(value==0){zero++;}
        
        }
        System.out.println(positive/n);
        System.out.println(negative/n);
        System.out.println(zero/n);
    }
}