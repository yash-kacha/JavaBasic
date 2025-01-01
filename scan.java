package basic;
import java.util.*;
public class scan {
   
    public static void main(String args[])
    {
    try (Scanner sc = new Scanner(System.in)) {
            int name = sc.nextInt();

            /*
            nextLine = string
            nextInt = int
            nextFloat = float 
            */
            System.out.println(name);
        }
    }
    
}
