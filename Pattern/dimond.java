package pattern;
import java.util.*;
public class dimond {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++)
        {
            for(int j = n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            
            for(int j = 2;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n;i>=1;i--)
        {
            for(int j = n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j = 2;j<=i;j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
}
