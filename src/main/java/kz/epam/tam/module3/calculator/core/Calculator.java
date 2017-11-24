package kz.epam.tam.module3.calculator.core;

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
        return a / b;
    }
}
