package recursion;

import java.util.Scanner;

public class test 
{
    public static int sum(int n)
    {   System.out.println("n : "+n);
        if(n!=0)
        {
            return n+sum(n-1);
        }
        else
        {
            return n;
        }
        
        
        
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");

        int n = sc.nextInt();
        
        System.out.println(sum(n));
    }
}
