package basic;
import java.util.*;

public class cases
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int x,y,z;
    System.out.print("enter a nuumber x : ");
    x = sc.nextInt();
    System.out.print("enter another number y : ");
    y = sc.nextInt();

    System.out.print(" 1 = +\t2 = -\t3 = *\t4 = /\t5 = % ");
    z = sc.nextInt();

    switch(z)
    {
        case 1 :{
                    System.out.println(x+y);
                    break;
                }   
        case 2 :{
                    System.out.println(x-y);
                    break;
                }         
        case 3 :{
                    System.out.println(x*y);
                    break;
                }  
        case 4 :{
                    System.out.println(x/y);
                    break;
                } 
        case 5 :{
                    System.out.println(x%y);
                    break;
                }   
    }

}
}

