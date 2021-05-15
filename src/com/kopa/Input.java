package com.kopa;
import java.util.Scanner;

public class Input {
    static Scanner in = new Scanner(System.in);

    static int getMinNum() {
        int res;
        while (true) {
            try {
                System.out.println("Please enter the minimal value. Recommended - 0:");
                res = Input.in.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Please enter a number, not a character. Example input: 0");
            }
        }

        return res;
    }

    static int getMaxNum() {
        int res;
        while (true) {
            try {
                System.out.println("Please enter the maximum value. Recommended - 100:");
                res = Input.in.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Please enter a number, not a character. Example input: 100");
            }
        }

        return res;
    }

    static int guessNum() {
        int res;
        while (true) {
            try {
                System.out.println("Please enter your guess:");
                res = Input.in.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Please enter a number, not a character. Example input: 50");
            }
        }

        return res;
    }
}
