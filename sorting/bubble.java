package sorting;

import java.util.*;

public class bubble
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

        // for(int i = 0;i<size;i++)
        // {
        //     for(int j=(i+1);j<size;j++)
        //     {

            
        //     if(sort[i]>sort[j])
        //     {
        //         sort[i]=sort[i]+sort[j];
        //         sort[j]=sort[i]-sort[j];
        //         sort[i]=sort[i]-sort[j];
        //     }
        //     }

        for(int i = 0 ; i<(size-1);i++)
        {   
            for(int j = 0 ; j<(size-1-i);j++)
            {
               
                if(sort[j]>sort[(j+1)])
                {
                    sort[j]=sort[j]+sort[(j+1)];
                    sort[(j+1)]=sort[j]-sort[(j+1)];
                    sort[j]=sort[j]-sort[(j+1)];
                }
                
            }
        }
        for(int k =0;k<size;k++)
        {
            System.out.print(sort[k]+" ");
        }
}
    }
         
