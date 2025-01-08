package recursion;

import java.util.*;

public class fact 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");

        int n = sc.nextInt();
       
        logic s1 = new logic();
        System.out.println(s1.factn(n));
    }
}
class logic
{
    int ans=1;
    int factn(int n)
    {
        if(n==1)
        {
            return 1;
        }
        ans=n*factn(n-1);
        return ans;
    }
}
