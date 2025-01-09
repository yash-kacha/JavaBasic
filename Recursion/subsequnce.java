package recursion;

import java.util.Scanner;

import basic.elseif;

// comment for unique subsequence 
import java.util.HashSet;
public class subsequnce 
{
    public static void sub(String x,String n,int i,HashSet<String> set)
    {
        if(i ==x.length())
        {  
            if(set.contains(n))
            {
                return;
            } 
            else
            {
                System.out.println(n);
                set.add(n);
                 return  ;
            }
           
           
        }

        char current = x.charAt(i);

        
        sub(x,n+current,i+1,set);
        sub(x,n,i+1,set);

        return ;
        
    }
    public static void main(String[] args) 
    {
        
        Scanner sc =  new Scanner(System.in);

        System.out.print("enter anything : ");
        String x = sc.nextLine();
        HashSet<String> set = new HashSet<>();

        sub(x,"",0,set);
    }
}
