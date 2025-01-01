package basic;
import java.util.*;
 
public class condition {
    
    public static void main(String args[]) {
        System.out.print("enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        if (age>=18)
        {
            System.out.println("above 18");
        }
        else
        {
            System.out.println("below 18");
        }
        
    }
    
}
