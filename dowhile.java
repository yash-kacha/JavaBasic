
package loops;
import java.util.*;


public class dowhile {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int x = sc.nextInt();
        int i=1,sum=0;
        
        do
        {    
            sum=sum+i;
            
            i++;
        }while(i<=x);
        System.out.println(sum);
    }

}
