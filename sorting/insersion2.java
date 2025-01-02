package sorting;

import java.util.Scanner;

public class insersion2 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter how many number you want to sort : ");
        int size= sc.nextInt();

        int sort[]=new int[size];
        System.out.print("enter numbers : ");

        for(int i =0;i<size;i++)
        {
            sort[i]=sc.nextInt();
        }

        for(int i = 1;i<size;i++)
        {   int t=0,tv=sort[i];
            for(int j=0;(j<i)&&(t==0);j++)
            {
                if(sort[i]<sort[j])
                {
                    t=1;
                    for(int z=(i-1);z>=j;z--)
                    {
                        sort[z+1]=sort[z];
                    }
                    sort[j]=tv;
                }

                System.out.print(i+" "+j+"   ");
                for(int k =0;k<size;k++)
                {
                    System.out.print(sort[k]+" ");
                }
                System.out.println();      
            }
           
        }
        
        for(int k =0;k<size;k++)
        {
            System.out.print(sort[k]+" ");
        }
    }
}

