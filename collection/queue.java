package collection;

import java.util.Queue;
import java.util.LinkedList;
public class queue 

//queue 
{
    public static void main(String[] args) 
    {
        Queue<Integer> op = new LinkedList<>();

        //add,remove and element are dangurus to use because they throw exeption 
        //offer & add are used to insert element in queue
        op.offer(1);
        op.offer(222);
        op.offer(22);

        System.out.println(op);

        //poll & remove used to delete element in queue
        op.poll();
        System.out.println(op);

        //peek and element used to see which element is next
        System.out.println(op.peek());

    }
}
