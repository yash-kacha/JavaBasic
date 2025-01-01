package array;
import java.util.*;
public class array2d 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter size of row and collume : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println();
        int matrix[][] = new int [r][c];
        System.out.println("enter values");
        for(int i =0;i<r;i++)
        {
            for(int j =0;j<c;j++)
            {
                int k=sc.nextInt();
                matrix[i][j]=k;
            }
        }

        System.out.print("enter a number to search : ");
        int s = sc.nextInt();
        int ch=0;
        for(int i =0;i<r;i++)
        {
            for(int j =0;j<c;j++)
            {
                if(matrix[i][j]==s)
                {ch=1;
                    System.out.println("entered number "+s+" has been found on ("+i+","+j+") cordinates");
                }
            }

            
        }
        if(ch==0){
            System.out.println("entered number"+s+"has not been found in matrix");
            }
    }
    
}
