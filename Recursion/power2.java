package recursion;

import java.util.Scanner;

public class power2 
{  int c=0;
    int pow(int x,int n)
    {   c++;
        if(n==1)
        {   
            return x;
        }
        else if(n%2==0)
        {   
            return pow(x,n/2)*pow(x,n/2);
            
            
        }
        else
        {
            
            return pow(x,n/2)*pow(x,n/2)*x;
        }
        
       
        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int x = sc.nextInt();


        System.out.print("enter power : ");
        int n = sc.nextInt();
       
        power2 o1 = new power2();
        System.out.println(o1.pow(x,n));
        System.out.println(o1.c);
    }
}
