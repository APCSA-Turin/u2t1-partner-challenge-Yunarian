package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        Calculator TI84 = new Calculator("TI84");
        System.out.println(TI84.performOperation("+", 2, 4));
        System.out.println(TI84.info());
        
    }
}
