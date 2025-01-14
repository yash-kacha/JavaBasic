package pattern;
import java.util.*;
public class pyramid 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int z=1;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(z+" ");
                z++;
            }System.out.println();
        }
    }  
}
