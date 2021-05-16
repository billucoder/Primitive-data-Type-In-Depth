package com.harish.oops;

public class BiNumberRunner {

    public static void main(String[] args) {
	// write your code here

        BiNumber numbers = new BiNumber(2,3);
        System.out.println(numbers.add()); //2+3 =6
        System.out.println(numbers.multiply()); //2*3 =6
        numbers.doubleValue(); // here double is key words name of the methods name of the values //
        System.out.println(numbers.getNumber1()); //2
        System.out.println(numbers.getNumber2()); //3


    }
}
