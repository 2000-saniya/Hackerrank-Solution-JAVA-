import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int j=scan.nextInt();
        double c=scan.nextDouble();
        String k;
        scan.nextLine();
        k=scan.nextLine();
        System.out.println(j+i);
        System.out.println(c+d);        
        System.out.println(s+k);
        scan.close();
    }
}