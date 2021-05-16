package com.kopa;
import com.kopa.Input;
import com.kopa.Number;
import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> getNums() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int min;
        int max;

        do {
            min = Input.getMinNum();
            max = Input.getMaxNum();

            nums.add(0, min);
            nums.add(1, max);
            if (max < min) {
                System.out.println("Make sure your minimal value is smaller than your maximum");
            }
        } while (max < min);

        return nums;
    }

    public static void main(String[] args) {
        Number num = new Number();
        ArrayList<Integer> settingsVals = new ArrayList<Integer>();
        settingsVals = Main.getNums();
        num.genNum(settingsVals.get(0), settingsVals.get(1));

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
