package bitwise;

import java.util.Scanner;

public class toggel {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int x = sc.nextInt();
        System.out.print("enter which bit you want to toggel : ");
        int y = sc.nextInt();
        int bitmask = 1<<y;

        System.out.print(x+" ");
        for(int i =0;i<10;i++)
        {
            x=x^bitmask;
            System.out.print(x + " ");
        }
    }
    
}
