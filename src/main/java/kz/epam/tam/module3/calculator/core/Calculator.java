package kz.epam.tam.module3.calculator.core;

import kz.epam.tam.module3.calculator.utils.CalcPrinter;

public class Calculator {

    public final String SUM_OPERATOR = " + ";
    public final String SUB_OPERATOR = " - ";
    public final String MULT_OPERATOR = " * ";
    public final String DIV_OPERATOR = " / ";

    public int sum(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public int mult(int a, int b){
        return a * b;
    }
    public int div(int a, int b){
        int division = 0;
        try{
            division = a / b;
        }catch (ArithmeticException e){
            CalcPrinter.printError(e.getMessage());
        }
        return division;
    }
}
