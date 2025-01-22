package loops;
import java.util.*;

public class whileloop {
    public static void main(String args[])
    {
        System.out.println("enter a number : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i=1;
        while(i<=x)
        {
            System.out.println(i);
            i++;
        }
    }
    
}
