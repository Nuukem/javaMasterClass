package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println(myString);

        myString = myString + ", and this is more!";
        System.out.println(myString);

        myString = myString + " \u00A9 2019";
        System.out.println(myString);

        String numberString = "45.99";
        numberString = numberString + "60.00";
        System.out.println(numberString);  // treated as text and not added together.

        String lastString = "50";
        int myInt = 10;
        lastString = lastString + myInt;
        System.out.println("lastString = " + lastString);  // Java casted the int as text
    }
}
