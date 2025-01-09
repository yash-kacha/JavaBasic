package recursion;

import java.util.Scanner;

public class sumofn 
{
    int s = 0;
    public int sum(int n)
    {   System.out.println("n : "+n+"   s : "+s);
        if(n==0)
        {
            return 0;
        }
        s=s+n;
        sum(n-1);
        
        return s;
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");

        int n = sc.nextInt();
       
        sumofn s1 = new sumofn();
        System.out.println(s1.sum(n));
    }
}
