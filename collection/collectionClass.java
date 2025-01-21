package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collectionClass 
{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(45);
        l.add(30);
        l.add(12);
        l.add(23);
        l.add(87);
        l.add(34);
        l.add(5);
        l.add(5);
        l.add(35);


        String abc="iadind";
        char che = abc.charAt(0);
        Collections.sort(l);
        System.out.println(Collections.max(l));
        System.out.println(Collections.min(l));
        Collections.reverse(l);
        System.out.println(Collections.frequency(l, 5)); 

        System.out.println(l);
    }    
}
