package college.cjava;

public class sumof20 
{
    public static void main(String[] args) 
    {   
        //Scanner sc= new Scanner(System.in);
        
       
        int k,x=0,p=2,s=0;
        while(x<20)
        {   k=1;
            
            for(int i=2;i<=(int)(p/2);i++)
            {
                if((p%i)==0)
                {
                    k=0;
                    break;
                }
            }
            if(k==1)
            {   System.out.println(p);
                s=s+p;
                x++;
            }
            p++;
        }
       
            System.out.println("sum is : "+s);
        }
}
