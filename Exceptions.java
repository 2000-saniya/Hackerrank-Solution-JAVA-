import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Exceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
            try
            {
              Integer.parseInt(S);
              System.out.println(S);
            }
            catch(NumberFormatException ex)
            {
              System.out.println("Bad String");
            }
            
        }
        
    }
