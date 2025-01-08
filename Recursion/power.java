package recursion;

import java.util.Scanner;

public class power
{
    static int pow(int x,int n)
    {
        if(n==1)
        {
            return x;
        }
        
        return x*pow(x,n-1);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int x = sc.nextInt();


        System.out.print("enter power : ");
        int n = sc.nextInt();
       
        
        System.out.println(pow(x,n));
    }
}


