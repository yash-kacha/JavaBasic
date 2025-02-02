package string;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class test 
{
    public static int d2b(int a)
    {   int o=a,v=0;
        int bitmask;
        double la = Math.floor(Math.log(a)/Math.log(2));
        int l = (int)la;
        
        for(int i =l;i>=0;i--) 
        {
            bitmask=1<<i;
            if((o&bitmask)>0)
            {
                //System.out.print("1");
                v=v+(int)Math.pow(10,i);
            }
           
        }
        return v;
    }

    public static int b2d(int a)
    {
        int b = 1,ld,t=a,d=0;
        for(;t>.1;)
        {
            ld = t%10;
            t=t/10; 

            d=d+(ld*b);
            b = b*2;   
        }
    
        return d;
        
    }
    public static List<Integer> sToB(String s )
    {
        List<Integer> list = new ArrayList<>();
        int l = s.length();

        for(int i = 0 ;i<l;i++)
        {
            list.add(d2b(Integer.valueOf(s.charAt(i))));
        }
        return list ;
    }
   

    public static String bToS(String s)
    {
        int l = s.length();
        int i=0,start=0,temp;
        String op="";
        while(i<l)
        {
            
            if(s.charAt(i)==' ')
            {
                String sub = s.substring(start, (i));
                temp =Integer.parseInt(sub);

                op+=(char)(b2d(temp));
                start=i+1;
            }
            else if(i==(l-1))
            {
                String sub = s.substring(start, (i+1));
                temp =Integer.parseInt(sub);

                op+=(char)(b2d(temp));
                start=i+1;
            }
            i++;
        }
        return op;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        
        
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter a string :: ");
        String name=sc.nextLine();


        System.out.println("0=encryption  1 = decrption");
        int temp = sc.nextInt();

        if(temp==0)
        {
            list = sToB(name);

            for( Integer a : list)
            {
                System.out.print(a+" ");
            }
        }
        
        else{
            System.out.println(bToS(name));
        }
    }
}
