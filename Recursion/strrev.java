package recursion;

import java.util.Scanner;

public class strrev 
{
    public static void rev(int x,String n)
    {
        if(x<0)
        {
            return;
        }
        System.out.print(n.charAt(x));
        rev(x-1,n);
    }
    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner(System.in);

        System.out.print("enter anything : ");
        String n = sc.nextLine();
        int x = n.length()-1;
        System.out.println(n+x);

        rev(x,n);
    }
}
