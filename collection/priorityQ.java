package collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//queue
public class priorityQ 
{
    public static void main(String[] args) 
    {
        Queue<Integer> op = new PriorityQueue<>();
        op.offer(34);   
        op.offer(87);   
        op.offer(2);   
        op.offer(90);  
         

        System.out.println(op);

        Queue<Integer> po = new PriorityQueue<>(Comparator.reverseOrder());
        po.offer(45);
        po.offer(454);
        po.offer(15);
        po.offer(5);
        System.out.println(po);

    }
}
