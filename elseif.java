package basic;
import java.util.*;
 
public class elseif {
    
    public static void main(String args[]) {
        System.out.print("enter your a : ");

        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();

            System.out.print("enter your b : ");
            int b = sc.nextInt();
            
            if (a>b)
            {
                System.out.println("a is greater than b");
            }
            else if (a==b)
            {
                System.out.println("a is equal to b");
            }
            else
            {
                System.out.println("b is grater than a");
            }
        }
    }
    
}
