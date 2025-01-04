package org.example;

import java.util.Scanner;

public class SecondsSubtraction {

    public static void main(String[] args) {
        //System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        int firstHours = scanner.nextInt();
        int firstMinutes = scanner.nextInt();
        int firstSeconds = scanner.nextInt();

        int secondHours = scanner.nextInt();
        int secondMinutes = scanner.nextInt();
        int secondSeconds = scanner.nextInt();

        firstHours *= 3600;
        firstMinutes *= 60;
        secondHours *= 3600;
        secondMinutes *= 60;

        int total = (secondHours + secondMinutes + secondSeconds) - (firstHours + firstMinutes + firstSeconds);
        System.out.println(total);

        scanner.close();
    }
}
