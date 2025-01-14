package pattern;
import java.util.*;
public class pyramid1 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int s;
        for(int i=1;i<=n;i++)
        {
            for(s=(n-i);s>=1;s--)
            {
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }

            for(int z = 2;z<=i;z++)
            {
                System.out.print(z);
            }
            System.out.println();
        }
    }
    
}
