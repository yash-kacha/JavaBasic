package bitwise;
import java.util.*;
public class set {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int x = sc.nextInt();
        System.out.print("enter which bit you want to set : ");
        int y = sc.nextInt();
        int bitmask = 1<<y;

        x=x|bitmask ;     
        System.out.println(x);
    }
    
}
