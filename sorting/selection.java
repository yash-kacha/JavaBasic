package sorting;

import java.util.Scanner;

public class selection 
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

        int min,t;

        for(int i = 0;i<size;i++)
        {   
            min=i;
            for(int j = (i+1);j<size;j++)
            {
                if(sort[min]>sort[j])
                {
                    min=j;
                }
                
            }
                t=sort[i];
                sort[i]=sort[min];
                sort[min]=t;
            

            // for(int v =0;v<size;v++)
            // {
            //     System.out.print(sort[v]+" ");
            // }
            // System.out.println();
            

        }
        for(int i =0;i<size;i++)
        {
            System.out.print(sort[i]+" ");
        }
    }
}