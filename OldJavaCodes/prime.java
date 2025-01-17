package college.cjava;

import java.util.*;
public class prime 
{
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n, i, flag=0;
        
        System.out.print("Enter a number to check if it is a prime number or not: ");
        n=scan.nextInt();
        
        for(i=2; i<n; i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        
        if(flag==1)
        {
            System.out.println(n+" is not a prime number.");
        }
        else
        {
            System.out.println(n+" is a prime number.");
        }
    }
}
    

