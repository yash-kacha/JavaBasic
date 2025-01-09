package recursion;

import java.util.*;

class towerOH
{
    public static void toh(int n , String source, String helper,String desti)
    {
        if(n==1)
        {
            System.out.println("transfer disk "+n+" from "+source+" to "+desti);
            return;
        }
        toh(n-1,source,desti,helper);
        System.out.println("transfer disk "+n+" from "+source+" to "+desti);
        toh(n-1,helper,source,desti);
    }
    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner(System.in);

        System.out.print("enter total disk : ");
        int n = sc.nextInt();

        

        toh(n,"source","helper","destination");

    }
}