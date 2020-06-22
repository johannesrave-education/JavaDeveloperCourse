package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens.");
        }

        int topScore = 80;

        if (topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100.");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true.");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println();
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar){
            System.out.println("wasCar is true");
        }

        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double result = (myFirstDouble + mySecondDouble) * 100.00d;
        double secondResult = result % 40.00d;

        boolean isZero = (secondResult == 0)? true : false;

        System.out.println("The remainder is Zero is " + isZero);

        if (!isZero){
            System.out.println("Got some remainder.");
        }

    }
}
