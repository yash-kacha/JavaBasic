package recursion;

import java.util.*;
public class moveatend 
{   static int f=0;
    public static StringBuilder end(StringBuilder sb,char s,int i)
    {   
        if(i==sb.length()-1-f)
        {//System.out.println(sb);
            return sb;
        }

        if(s==sb.charAt(i))
        {
            f++;
            //System.out.println(sb);
            sb.delete(i,i+1);
            sb.append(s);
            
            return end(sb,s,i);
            
           
        }
        else
        {//System.out.println(sb);
        return end(sb,s,i+1);
        }
    }
    public static void main(String[] args) 
    {
        
        Scanner sc =  new Scanner(System.in);

        System.out.print("enter anything : ");
        String n = sc.nextLine();

        StringBuilder sb = new StringBuilder(n);

        System.out.print("enter any char : ");
        char s=sc.next().charAt(0);

        System.out.println(end(sb,s,0));
    }
}
