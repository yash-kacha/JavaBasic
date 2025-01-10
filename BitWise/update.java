package bitwise;

import java.util.Scanner;

public class update {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int x = sc.nextInt();

        System.out.print("enter which bit you want to update : ");
        int y = sc.nextInt();
        int bitmask = 1<<y;

        System.out.println("you want to 0 = clear , 1 = set , 2 = flip");
        int z = sc.nextInt();

        if(z==0)
        {
            bitmask=~bitmask;
            x=x&bitmask;
            System.out.println(x);
        }
        else if(z==1)
        {
            x=x|bitmask;
            System.out.println(x);

        }
        else if(z==2)
        {
            x=x^bitmask;
            System.out.println(x);

        }
    }
    
}
