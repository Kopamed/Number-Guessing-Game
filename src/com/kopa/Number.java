package com.kopa;

public class Number {
    private int answer;
    int tries = 0;

    public void genNum(int minNum, int maxNum) {
        while (true) {
            int randomNum = (int) Math.round(Math.random() * maxNum);

            if (randomNum > minNum) {
                this.answer = randomNum;
                break;
            }
        }
    }

    public int checkAnswer(int num) {
        if (num == this.answer) {
            this.tries++;
            return 1;
        } else if (num >  this.answer) {
            this.tries++;
            return 2;
        } else {
            this.tries++;
            return 0;
        }
    }
}
