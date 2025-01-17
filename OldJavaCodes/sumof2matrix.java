package college.cjava;

import java.util.*;
public class sumof2matrix 
{
    public static void main(String[] args) 
    {   
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size of raw : ");
        int n=sc.nextInt();
        System.out.print("enter size of collume : ");
        int m=sc.nextInt();
        int x[][]= new int[n][m];
        int y[][]= new int[n][m];
        
        System.out.println(" enter first matrix ");
        for(int i =0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                x[i][j]=sc.nextInt();
            }
        }System.out.println();
        
        System.out.println(" enter second matrix ");
        for(int i =0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                y[i][j]=sc.nextInt();
            }
        }System.out.println();
        
        System.out.println(" sum of both matrix is : ");
        for(int i =0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                 System.out.print(((x[i][j])+(y[i][j]))+" ");
            }
            System.out.println();
        }System.out.println();
        
        System.out.println(" sub of both matrix is : ");
        for(int i =0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                 System.out.print(((x[i][j])-(y[i][j]))+" ");
            }
            System.out.println();
        }
    }
}
    

