package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

// list
public class arraylist 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //declaration
        List<Integer> op = new ArrayList<>();
        for(;;)
        {
            System.out.print("enter a number (0 == exit): ");
            int n = sc.nextInt();
            if(n==0) break;
            //adding elements in arraylist op.add(element)
            else op.add(n);
            //size=0 > size=10 > size=16  (size=(n)+(n/2)+1)
        }
        System.out.println(op);

        //add element to any index
        System.out.print("enter a index and a number you wanted to add : ");
        op.add(sc.nextInt(),sc.nextInt());
        System.out.println(op);

        List<Integer> po = new ArrayList<>();
        po.add(90);
        po.add(56);
        po.add(455);

        //addall
        System.out.print("enter a index from where you wanted to add another list : ");
        op.addAll(sc.nextInt(),po);
        System.out.println(op);

        //get
        System.out.print("enter a index to get that index value : ");
        System.out.println(op.get(sc.nextInt()));

        //set
        System.out.print("enter a index and number set that index value : ");
        op.set(sc.nextInt(),sc.nextInt());
        System.out.println(op);

        //remove
        System.out.print("enter a index to remove that index value : ");
        op.remove(sc.nextInt());
        System.out.println(op);

        //remove with value  and contain
        System.out.print("enter a value to remove that value : ");
        int n=sc.nextInt();
        for(;op.contains(n);)op.remove(Integer.valueOf(n));
        System.out.println(op);

        System.out.print("[ ");
        for(int i =0;i<op.size();i++)
        {
            System.out.print(op.get(i)+" ");
        }
        System.out.println("]");


        System.out.print("[ ");
        for(Integer i:op)
        {
            System.out.print(i+" ");
        }
        System.out.println("]");
        
        System.out.println("[ ");
        Iterator<Integer> it=op.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println("]");


        op.clear();
        System.out.println(op);
        

    }
}
