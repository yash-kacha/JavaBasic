package collection;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class treeHas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new TreeSet<>();

        for (;;) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            else
                s.add(n);
        }
        System.err.println(s);

    }

}
