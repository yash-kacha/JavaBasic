package string;

import java.util.*;

public class basic
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String pro = "this program is for understanding basic string \nenter first name ,middel name ,last name";
        System.out.println(pro);
        String fname = sc.nextLine();
        String mname = sc.nextLine();
        String lname = sc.nextLine();

        //concatanation
        String fullname = fname+" "+mname+" "+lname;
        System.out.println(fullname);

        //lenth
        int x = fullname.length();
        System.out.println("length is : "+x);

        //charAt
        for(int i=0;i<x;i++)
        {
            System.out.print(fullname.charAt(i)+" ");
        }

        //compare
        if(fname.compareTo(mname)==0)
        {
            System.out.println("strings are same");
        }
        else{
            System.out.println("strings are not same");
        }
        
        //substring
        System.out.println(fullname.substring(15,21));

        String xyz="yash123";
        

    }
}
