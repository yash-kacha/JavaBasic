package array;
import java.util.*;
public class search {
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

        System.out.println("which num you want to find : ");
        int x = sc.nextInt();
        int f=0;
        for(int i =0;i<size;i++)
        {
            if(num[i]==x)
            {
                System.out.println("entered number : "+x+" has been found at index : "+i);
                f=1;
                
            }
            
        }
        if(f==0)
            {
                System.out.println("entered number : "+x+" is not found in array");
            }

    }
    
}


