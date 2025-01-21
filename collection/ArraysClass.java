package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class ArraysClass {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 100;
        Integer[] no = new Integer[n];

        Set<Integer> s = new LinkedHashSet<>();
        while (s.size() < n) {
            s.add(r.nextInt(0, 1000));
        }
        s.toArray(no);
        
        for(int i=0;i<n;i++)
        {
            System.out.print(no[i]+" ");
        }
        Arrays.sort(no);

        System.out.println("\n\n");
        for(int i=0;i<n;i++)
        {
            System.out.print(no[i]+" ");
        }

        System.out.println(Arrays.binarySearch(no,55));

        Arrays.fill(no,90,100,155);
        System.out.println(Arrays.toString(no));
    }
}
