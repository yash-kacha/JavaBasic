package basic;
import java.util.*;
public class array {
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("how manu number you want to store : ");
        int size=sc.nextInt();
        int num[]=new int[size];

        for(int i =0;i<size;i++)
        {
            System.out.print("enter a number : ");
            int k = sc.nextInt();
            num[i]=k;
        }
        for(int i =0;i<size;i++)
        {
            System.out.print(" " +num[i]+" ");
            
            
        }


    }
    
}
