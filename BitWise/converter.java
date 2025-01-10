package bitwise;
import java.util.*;
import java.lang.Math;

public class converter 
{
    public static void d2b(int a)
    {   int o=a,v=0;
        int bitmask;
        double la = Math.floor(Math.log(a)/Math.log(2));
        int l = (int)la;
        
        for(int i =l;i>=0;i--) 
        {
            bitmask=1<<i;
            if((o&bitmask)>0)
            {
                System.out.print("1");
                v=v+(int)Math.pow(10,i);
            }
            else
            {System.out.print("0");}
        } 
        System.out.println("\nbinary number is : "+v); 
    }

    public static void b2d(int a)
    {
        int b = 1,ld,t=a,d=0;
        for(;t>.1;)
        {
            ld = t%10;
            t=t/10; 

            d=d+(ld*b);
            b = b*2;   
        }
        System.out.println(d);

        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 = decimal to binary  ::  2 = binary to decimal : ");
        int c = sc.nextInt();

        if (c==1)
        {
            System.out.print("enter a decimal number : ");
            int a = sc.nextInt();
            d2b(a);
        }

        else if (c==2)
        {
            System.out.print("enter a binary number : ");
            int a = sc.nextInt();
            b2d(a);
        }

        else
        {
            System.out.print("you have entered wronge choise");
        }

    }

    
}