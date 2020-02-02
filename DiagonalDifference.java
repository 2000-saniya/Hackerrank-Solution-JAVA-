import java.util.*;
import java.math.*; 

class DiagonalDifference{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int i,j,sum1=0,sum2=0,row,col,result;
row=sc.nextInt();
col=sc.nextInt();
int[][] arr=new int[row][col];
System.out.println("Enter the matrix element");
for(i=0;i<row;i++)
{
  for(j=0;j<col;j++)
   {
    arr[i][j]=sc.nextInt();
   }
}
System.out.println("The element of the matrix");
 for(i=0;i<row;i++)
 {
  for(j=0;j<col;j++)
  {
   System.out.print(arr[i][j]+ "\t");
  }
 System.out.println(" ");
}
for(i=0;i<row;i++)
 {
  for(j=0;j<col;j++)
  {
  if(i==j)
   {
    sum1=sum1+arr[i][j];
   }
  if(i==row-j-1)
   {
    sum2=sum2+arr[i][j];
   }
  }
}

   System.out.print(Math.abs(sum1-sum2));
}
}
