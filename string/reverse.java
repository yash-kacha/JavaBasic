package string;
import java.util.*;
public class reverse {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        char t;
        int x,l=sb.length();
        for(int i = 0 ;i<=((l/2)-1);i++)
        {x=i;
            t =sb.charAt(x);
            sb.setCharAt(x,sb.charAt(l-x-1));
            sb.setCharAt((l-x-1),t);
    }
        System.out.println(sb);
    }
    
    
}
    