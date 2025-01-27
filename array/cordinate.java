package array;

import java.util.*;

public class cordinate{ 
    public static void main(String args[])
{
    Scanner sc = new Scanner (System.in);
    System.out.print("enter size of row and collume : ");
    int r = sc.nextInt();
    int c = sc.nextInt();
    
    int matrix[][] = new int [r][c];
    for(int i =0;i<r;i++)
    {
        for(int j =0;j<c;j++)
        {
           System.out.print("("+i+","+j+") ");
        }System.out.println();
    }
}
}


