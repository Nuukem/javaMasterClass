package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        // remainder operator
        result = result % 3;  // return the remainder after dividing the result by 3
        System.out.println(previousResult + " % 3 = " + result);

        result++; // same as result = result + 1
        System.out.println("result++ = " + result);

        result--; // same as result = result - 1
        System.out.println("result-- = " + result);

        result += 2; // same as result = result + 2
        System.out.println("result+=2 = " + result);



        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is NOT an alien");
        }

        int topScore = 80;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score but less than 100");
        }

        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("One of these tests is true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = true;
        if (isCar) {
            System.out.println("isCar is true");
        }

        // turnery operator
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Challenge
        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //    if the remaining total (#4) is equal to 20 or less.

        // Discovery: d was not needed because double is inferred.
        double myFirstDouble = 20d;
        double mySecondDouble = 80d;
        double myTotal = (myFirstDouble + mySecondDouble) * 25d;
        System.out.println("myTotal = " + myTotal);
        // Discovery: int would have been ok here.
        double remainder = myTotal % 40d;
        System.out.println("remainder = " + remainder);
        if (remainder <= 20) {
            System.out.println("Total was over the limit");
        }

    }
}
