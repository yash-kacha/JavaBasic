package sorting;

import java.util.Scanner;

public class insersion 
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
        {   int c = i;
            for(int j=(i-1);j>=0;j--)
            {
                if(sort[c]<sort[j])
                {
                    sort[c]=sort[c]+sort[j];
                    sort[j]=sort[c]-sort[j];
                    sort[c]=sort[c]-sort[j];
                    c--;
                }
                System.out.print(i+" "+j+"   ");
                for(int k =0;k<size;k++)
                {
                    System.out.print(sort[k]+" ");
                }
                System.out.println();   
                
                //if(sort[i]<sort[j]){ t1=1;}

            }
           
        }
        
        for(int k =0;k<size;k++)
        {
            System.out.print(sort[k]+" ");
        }
    
    }
}
