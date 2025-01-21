package collection;

import java.util.ArrayDeque;
public class arrayDeque 

{
    public static void main(String[] args) 
    {
        ArrayDeque<Integer> op = new ArrayDeque<>();

        op.offer(1);
        op.offerFirst(2);
        op.offerLast(3);
        System.out.println(op);
        
        System.out.println(op.peek());
        System.out.println(op.peekFirst());
        System.out.println(op.peekLast());

        System.out.println(op.poll());
        System.out.println(op.pollFirst());
        System.out.println(op.pollLast());


    }
}
