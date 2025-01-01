package array;

import java.util.Scanner;

public class spiral {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter size of row and collume : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println();
        int ma[][] = new int [n][m];
        System.out.println("enter values");
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                int k=sc.nextInt();
                ma[i][j]=k;
            }
        }
        int rs=0,re=(n-1),cs=0,ce=(m-1),co=0;
           

        for(;;)
        {   
            //raw constant collume++
            for(int p=cs;p<=ce;p++)  
            {
                System.out.print(ma[rs][p]+" ");
            } 
            rs++;

            //collume constant raw++
            for(int q=rs;q<=re;q++)  
            {
                System.out.print(ma[q][ce]+" ");   
            } 
            ce--;

            //raw constunt collume--
            for(int r=ce;r>=cs;r--)
            {
                System.out.print(ma[re][r]+" ");
            }
            re--;

            //collume constant raw--
            for(int s=re;s>=rs;s--)
            {
                System.out.print(ma[s][cs]+"   ");
            }
            cs++;
            


            if(co==1)
            {
                break;
            }
            if((cs>ce)||(rs>re))
            {
                co=1;
            }       
        }
    }
}
