package kz.epam.tam.module3.calculator.utils;

import kz.epam.tam.module3.calculator.core.Calculator;

public class CalcHelper {

    private static int operation;
    private static String operator;

    public static void executeCalcOperation(int operationType){
        Calculator calc = new Calculator();
        Logger.printNumberSequence("first");
        int number1 = Reader.readData();
        Logger.printNumberSequence("second");
        int number2 = Reader.readData();
        if(operationType == 1){
            operation = calc.sum(number1,number2);
            operator = " + ";
        }
        else if(operationType == 2){
            operation = calc.sub(number1,number2);
            operator = " - ";
        }
        else if(operationType == 3){
            operation = calc.mult(number1,number2);
            operator = " * ";
        }
        else if(operationType == 4){
            operation = calc.div(number1,number2);
            operator = " / ";
        }
        Logger.printResult(number1,number2,operator,operation);
    }

}
