package collection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author HP
 */
public class o {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> s = new ArrayList<>();
        Random r = new Random();
        System.out.print("enter a number : ");
        int n = sc.nextInt();

        int c = 0, sum = 0;
        while (c < n) {

            while (s.size() < n) {
                s.add(r.nextInt(0, n));
            }
            System.out.print(s.size() + " : ");
            System.out.println(s);

            for (int i = 0; i < s.size(); i++) {
                if ((s.get(i)) % 2 == 0) {
                    s.remove(i);
                }

            }
//            for (int i = 0; i < s.size(); i++) {
//                if ((s.get(i)) % 2 == 0) {
//                    s.remove(i);
//                }
//
//            }
            System.out.print(s.size() + " : ");
            System.out.println(s + "\n");

            sum += s.size();
            c++;

            s.clear();
        }
        System.out.println(sum);
        System.out.println("avg is : " + (sum / n));

        // TODO code application logic here
    }

}

