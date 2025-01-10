package bitwise;

import java.util.Scanner;
import java.lang.Math;
public class power {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int x = sc.nextInt();
        
        int c=0,p,bitmask;
        double l = Math.ceil(Math.log(x)/Math.log(2));
        System.out.println(l);
        for(int i =0;i<=l;i++) 
        {
            bitmask=1<<i;
            if(bitmask==x)
            {
                System.out.println("number is power of 2");
                c=1;
            }
        }  
        if(c== 0){System.out.println("number is not power of 2");} 
    }
    
}
