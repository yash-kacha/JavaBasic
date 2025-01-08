package recursion;

import java.util.*;
public class checksort 
{  static boolean t=true;
    public static boolean check(int n,int a[],int c)
    {
        if(c==n)
        {
            return true;
        }
        if(a[c]>=a[c+1])
        { 
            return false;
        }
    
        
            
        
        
    return check(n,a,c+1);
      
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size : ");
        int n = sc.nextInt();
        int a[]=new int[n];

        for(int i =0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("array is strictly sorted :"+ check(n-1,a,0));

    }
}
