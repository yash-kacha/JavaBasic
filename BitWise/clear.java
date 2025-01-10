package bitwise;

import java.util.Scanner;

public class clear {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int x = sc.nextInt();
        System.out.print("enter which bit you want to clear : ");
        int y = sc.nextInt();
        int bitmask = 1<<y;

        bitmask=~(bitmask);

        x = x&bitmask;
        System.out.println(x);
    }
}

