import java.util.*;

class basic
{
    public static void x(int i,int j)
    {
        
        if(i==j)
        { return;}
            System.out.println(i);
            x(i+1,j);
    }
        

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int i = sc.nextInt();
        int j = sc.nextInt();



        x(i,j);
    }
}
