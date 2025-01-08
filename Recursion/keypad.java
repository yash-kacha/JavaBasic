package recursion;

import java.util.Scanner;

public class keypad 
{
    public static String x[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printcomb(String n,int i,String comb)
    {
        if(i==n.length())
        {
            System.out.println(comb);
            return;
        }
       
        char cur = n.charAt(i);
        String t = x[(cur-'0')];

        for(int j=0;j<t.length();j++)
        {
            printcomb(n,i+1,comb+t.charAt(j));
        }

        
    }

    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner(System.in);

        System.out.print("enter any num : ");
        String n = sc.nextLine();

        printcomb(n,0,"");
    }
}
