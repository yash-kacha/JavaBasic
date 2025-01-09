package recursion;

import java.util.Scanner;

public class RemoveDuplicate 
{
    static boolean c[]=new boolean[26];
    
    public static StringBuilder find(StringBuilder sb,int i)
    {   
        if(i==sb.length())
        {
            return sb;
        }
        
        System.out.println(sb);
        char current = sb.charAt(i);
        int t = current-97;

        
        if(c[t]==false)
        {
            c[t]=true;
            return find(sb,i+1);
        }
        else
        {
            sb.delete(i,i+1);
            return find(sb,i);
        }
        
    }
    public static void main(String[] args) 
    {
        
        Scanner sc =  new Scanner(System.in);

        System.out.print("enter anything : ");
        String x = sc.nextLine();

        StringBuilder sb= new StringBuilder(x);

        System.out.println(find(sb,0));
    }
}

