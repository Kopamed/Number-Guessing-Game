package com.kopa;
import java.util.Scanner;

public class Input {
    static Scanner in = new Scanner(System.in);


    static int getMinNum() {
        int res;
        // Line 10 to 19 is paste from https://kodejava.org/how-do-i-validate-input-when-using-scanner/ as I am a noob and have no idea how to sterilize input without getting cpu usage to 100%
        do {
            System.out.println("Enter the minimum number the guesser will be allowed ot make. Recommended - 0:");
            while (!Input.in.hasNextInt()) {
                String input = Input.in.next();
                System.out.println("Please enter a number, not a character. Example input: 0");
            }
            res = Input.in.nextInt();
            break;
        } while (res <= 0 || res >= 0);

      return res;
    }


    static int getMaxNum() {
        int res;
        // Line 28 to 36 is paste from https://kodejava.org/how-do-i-validate-input-when-using-scanner/ as I am a noob and have no idea how to sterilize input without getting cpu usage to 100%
        do {
            System.out.println("Enter the maximum number the guesser will be allowed ot make. Recommended - 100:");
            while (!Input.in.hasNextInt()) {
                String input = Input.in.next();
                System.out.println("Please enter a number, not a character. Example input: 100");
            }
            res = Input.in.nextInt();
            break;
        } while (res <= 0 || res >= 0);

        return res;
    }


    static int guessNum() {
        int res;
        // Line 44 to 53 is paste from https://kodejava.org/how-do-i-validate-input-when-using-scanner/ as I am a noob and have no idea how to sterilize input without getting cpu usage to 100%
        do {
            System.out.println("Enter your guess:");
            while (!Input.in.hasNextInt()) {
                String input = Input.in.next();
                System.out.println("Please enter a number, not a character. Example input: 50");
            }
            res = Input.in.nextInt();
            break;
        } while (res <= 0 || res >= 0);

        return res;
    }
}
