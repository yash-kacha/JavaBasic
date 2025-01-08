package recursion;

import java.util.Scanner;

public class permutation 
{   static int x=0;
    public static void per(String str,String perm)
    {   
        if(str.length()==0)
        {x++;
            System.out.println(x + " "+perm);
            return;
        }
        
        for(int i =0;i<str.length();i++)
        {   
            char cur = str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            per(newStr,perm+cur);
            
        }
        
    }   
    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner(System.in);

        System.out.print("enter anythimg : ");
        String n = sc.nextLine();

        
        per(n,"");
        
    } 
}
