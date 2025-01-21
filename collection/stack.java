package collection;

import java.util.Stack;
import java.util.*;

//list

public class stack 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Stack<String> s = new Stack<>();

        s.push("yash");
        s.push("kacha");
        s.push("abcd");

        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());


    }
}
