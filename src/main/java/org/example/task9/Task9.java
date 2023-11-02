package org.example.task9;


import java.util.Random;

public class Task9 {

    public static void main(String[] args) {
        
        // Initialize
        int numberOfBalls = 20;
        Basket basket = new Basket();
        Random rand = new Random();

        // Add balls to the basket
        for (int i = 0; i < numberOfBalls; i++) {
            basket.add(new Ball(rand.nextInt(20), Color.values()[ rand.nextInt(5) ] ));
        }

        System.out.println("Blue Balls: " + basket.countBlueBalls());
        System.out.println("Basket Weight: " + basket.getBasketWeight());

    }
}
