package recursion;

import java.util.Scanner;

public class path 
{
    static int s=0;
    
    public static int count(int n,int m,int x ,int y)
    {
        if(x==n-1 || y == m-1)
        {
            return 1;
        }
       
        
        int down = count(n,m,x+1,y);
        int right = count(n,m,x,y+1);
       
        return down+right;

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter raw and collume : ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(count(n,m,0,0));
    }
}
