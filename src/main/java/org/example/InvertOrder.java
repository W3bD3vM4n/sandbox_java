package org.example;
import java.util.Scanner;

public class InvertOrder {
    public static void main(String[] args) {
        System.out.println("Enter 4 names:");
        /* Input 1 word or a sentence with 2 words
        * next() it will jump the second word below
        * for example:
        * Jane Kate
          John
          Mary
        * */

        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        String name2 = scanner.next();
        String name3 = scanner.next();
        String name4 = scanner.next();

        System.out.println(name4);
        System.out.println(name3);
        System.out.println(name2);
        System.out.println(name1);

        scanner.close();
    }
}
