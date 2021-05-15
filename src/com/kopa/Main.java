package com.kopa;
import com.kopa.Input;
import com.kopa.Number;

public class Main {

    public static void main(String[] args) {
        Number num = new Number();
        int min = Input.getMinNum();
        int max = Input.getMaxNum();
        num.genNum(min, max);

        while (true) {
            int guess = Input.guessNum();
            int checkedRes = num.checkAnswer(guess);

            if (checkedRes == 1) {
                break;
            } else if (checkedRes == 0) {
                System.out.println("Unlucky! The number is bigger than that!");
            } else {
                System.out.println("Wrong! The number is smaller than that!");
            }
        }

        System.out.println("Congrats! You have won in " + num.tries + " tries. Try again to get a better score!");
    }
}
