package bitwise;
import java.util.*;
public class get {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int x = sc.nextInt();
        System.out.print("enter which bit you want to know : ");
        int y = sc.nextInt();
        int bitmask = 1<<y;

        if((x&bitmask)==0)
        {
            System.out.println("bit was 0");
        }
        else{System.out.println("bit was 1");}
    }
    
}
