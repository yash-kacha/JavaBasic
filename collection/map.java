package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //in TreeMap it will be in shorted way
        //in hash map it will be in any way
        //in linkedhashmap it will be as we give input

        Map<Integer, String> op = new LinkedHashMap<>();
        op.put(2, "usa");
        op.put(5, "japan");
        op.put(4, "aus");
        op.put(1, "aop");

        System.out.println(op.containsKey(3));
        System.out.println(op.containsValue("usa"));

        op.putIfAbsent(6,"ouip");

        for (Map.Entry<Integer, String> i : op.entrySet()) {
            // System.out.println(i);

            System.out.println("keys : " + i.getKey() + "  ::  value : " + i.getValue());

        }
        System.out.println();

        for(Integer i : op.keySet())
        {
            System.out.print(i+" ");
        }
        System.out.println();

        for(String i : op.values())
        {
            System.out.print(i+" ");
        }
    }
}
