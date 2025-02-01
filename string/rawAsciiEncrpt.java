import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class rawAsciiEncrpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string :: ");
        String name=sc.nextLine();


        System.out.print("0=encryption  1 = decrption : ");
        int temp = sc.nextInt();
        sc.nextLine();

        System.out.print("enter key (eg : yz) : ");
        String str = sc.nextLine();

        if(temp==0)
        {
                System.out.println(ctob(name,str.charAt(0),str.charAt(1)));
        }
        
        else{
            System.out.println(btoc(name,str.charAt(0),str.charAt(1)));
        }
    }
    

    public static String ctob(String xx,char a1,char a2)
    {
        String ans1="";
        for(int i=0;i<xx.length();i++)
        {
            String ans="";
            int ch = xx.charAt(i);
            int tt = 128;
            while(tt>=1)
            {
                if(ch>=tt)
                {
                    ans+=a1;
                    ch-=tt;
                }
                else{
                    ans+=a2;
                }
                tt/=2;
            }
    
            ans1+=ans;
        }
        return ans1;
    }

    public static String btoc(String x,char a1,char a2)
    {

        String s = x.replace(a1, '1');
        s = s.replace(a2, '0');


       int l = s.length();
        int i=1,start=0,temp;
        String op="";
        while(i<l)
        {
            if(i%8==0)
            {
                String sub = s.substring(start, (i));
                temp =Integer.parseInt(sub);

                op+=(char)(b2d(temp));
                start=i; 
            }
            else if(i==(l-1))
            {
                String sub = s.substring(start, (i+1));
                temp =Integer.parseInt(sub);

                op+=(char)(b2d(temp));
                start=i;
            }


            // if(s.charAt(i)==' ')
            // {
            //     String sub = s.substring(start, (i));
            //     temp =Integer.parseInt(sub);

            //     op+=(char)(b2d(temp));
            //     start=i+1;
            // }
            // else if(i==(l-1))
            // {
            //     String sub = s.substring(start, (i+1));
            //     temp =Integer.parseInt(sub);

            //     op+=(char)(b2d(temp));
            //     start=i+1;
            // }
            i++;
        }
        return op;
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
}
