package recursion;

import java.util.Scanner;

public class test1 
{   static int p=0,q=0;
     public static void fl(int x,int y,String n,char s)
    {
        if((y-x)>x)
        {return;}
         
        if(s==(n.charAt(y-x))&&q==0)
        {   
            System.out.println("char "+s+" is found at : "+(y-x));
            q=1;
        }
        
        if(s==(n.charAt(x))&&p==0)
        {   
            System.out.println("char "+s+" is found at : "+x);
            p=1;
        }

        
       
        fl(x-1,y,n,s);
    }
    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner(System.in);

        System.out.print("enter anything : ");
        String n = sc.nextLine();
        char s=sc.next().charAt(0);
        int x = n.length()-1;
        System.out.println(n+x);

        fl(x,x,n,s);
    }
}
