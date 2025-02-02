package string;

import java.util.*;
public class strbuilder {
    public static void main (String args[])
    {   
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);

        //char at
        System.out.println(sb.charAt(0));

        //set char at
        sb.setCharAt(0,'x');
        System.out.println(sb);

        //insert
        sb.insert(0,'y');
        System.out.println(sb);

        //delete
        sb.delete(1,2);
        System.out.println(sb);

        //insert at end or append
        sb.append('o');
        System.out.println(sb);
    }
    
}
