package com.harish.oops;

public class BiNumber { //Class Name

    private int number1; //member variable
    private int number2; //Member Variable

    //Constructor always starts with class name
   BiNumber (int num1, int num2){
       this.number1 = num1;
       this.number2 = num2;
    }

    //Method -

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return this.number2;
    }
//input - add

    public int getNumber1() {
        return this.number1;
    }
    //output -void
    //Name -

    public int add(){

      return this.number1+this.number2;
    }

    public int multiply() {
        return number1*number2;
    }

    public void doubleValue() {
       this.number1=number1*2;
       this.number2=number2*2;

    }
}
