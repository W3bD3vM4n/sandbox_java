package org.example;

import java.util.Scanner;

public class VowelOrNot {

    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0 ? true : false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
