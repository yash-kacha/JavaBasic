package string;

import java.util.*;

public class replace {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  any line : ");
        String any = sc.nextLine();

        //System.out.print("enter char to treplace with any character");
        // char x = sc.next().charAt(0);
        // char y = sc.next().charAt(0);

        // for(int i=0;i<(any.length());i++)
        // {
        //     if(any.charAt(i)==x)
        //     {
        //         System.out.print(y);            }
        //     else{
        //         System.out.print(any.charAt(i));
        //     }
        // }

        for(int i=0;i<any.length();i++)
        {   
            if(any.charAt(i)=='@'){break;}
            
            else{System.out.print(any.charAt(i));}
        }

    }
    
}
