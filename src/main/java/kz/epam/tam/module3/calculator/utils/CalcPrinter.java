package kz.epam.tam.module3.calculator.utils;

public class CalcPrinter {

    private static final String PROCEED_MENU = "Would you like to Proceed?\n" +
                                                "1 - Proceed \n" +
                                                "2 - Exit";
    private static final String MAIN_MENU = "Please, select a math operation:\n" +
                                            "1 - Sum\n" +
                                            "2 - Subtraction\n" +
                                            "3 - Multiplication\n" +
                                            "4 - Division";

    public static void printProceedMenu(){
        System.out.println(PROCEED_MENU);
    }
    public static void printMainMenu(){
        System.out.println(MAIN_MENU);
    }
    public static void printNumberSequence(String num){
        System.out.println("Please enter the "+ num + " number!");
    }
    public static void printResult(int number1,int number2,String operator,int operation){
        System.out.println("Result: " + number1 + operator + number2 + " = " + operation);
    }
    public static void printCalcStatus(int proceedOrExit){
        String startOrClose;
        if(proceedOrExit == 2){
            startOrClose = "closed";
        }
        else{
            startOrClose = "started";
        }
        System.out.println("Calculator is "+ startOrClose +"!");
    }
    public static void printError(String error){
        System.out.println(error);
    }
}
