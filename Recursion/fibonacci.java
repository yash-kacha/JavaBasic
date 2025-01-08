package recursion;

import java.util.*;

public class fibonacci 
{   
    static void fibo(int a,int b,int n)
    {   
        if(n==0)
        {
            return;
        }
        int c=a+b;
        // System.out.println(a+" "+b+" "+c+" "+n);
       
        System.out.print(" , "+c);
        fibo(b,c,n-1);
        
        
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");

        int n = sc.nextInt();
       
        logic s1 = new logic();
        System.out.print("0 , 1 ");
        fibo(0,1,n-2);
    }
}

