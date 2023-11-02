package org.example.task9;

import java.util.ArrayList;

public class Basket extends ArrayList<Ball> {

    public int countBlueBalls() {

        int blueBallsCounter = 0;
        for (Ball ball: this) {
            if (ball.ballColor == Color.BLUE) blueBallsCounter++;
        }
        return blueBallsCounter;
    }

    public int getBasketWeight() {

        int basketWeight = 0;
        for (Ball ball: this) {
            basketWeight += ball.ballWeight;
        }
        return basketWeight;
    }

}
