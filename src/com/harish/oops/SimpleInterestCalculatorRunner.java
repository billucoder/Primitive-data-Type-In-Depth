package com.harish.oops;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {
    public static void main(String[] args) {

        //New Instance calculator
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.0", "7.5");

        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println(totalValue);
    }
}
 //principal