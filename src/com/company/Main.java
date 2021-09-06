package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej číslo: ");
        int number = Integer.parseInt(sc.nextLine());
        if (number <= 0) while (number <= 0) number = Integer.parseInt(sc.nextLine());
        float output = 0;
        for (float i = 1; i < number + 1; i++) {
            System.out.println("1/" + i + "=> " + (1 / i));
            output += 1 / i;
        }
        System.out.println("Celkem => " + output);
    }
}
