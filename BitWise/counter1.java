package bitwise;

import java.util.Scanner;

public class counter1 {
    public static void main(String args[])
    {

    
    Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int x = sc.nextInt();
        
        int c=0,p,bitmask;
        double l = Math.ceil(Math.log(x)/Math.log(2));
        for(int i =0;i<=l;i++) 
        {
            bitmask=1<<i;
            if((bitmask&x)>0)
            {
                
                c++;
            }
        }
        System.out.println(c);
    }
}    