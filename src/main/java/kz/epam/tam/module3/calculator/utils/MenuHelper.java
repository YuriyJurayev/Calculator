package kz.epam.tam.module3.calculator.utils;

public class MenuHelper extends Helper {

    public int pickProceedOrExit(){
        System.out.println("Would you like to Proceed?");
        System.out.println("1 - Proceed ");
        System.out.println("2 - Exit ");
        number1 = scanner.nextInt();
        return number1;
    }
    public int pickOne(){
        System.out.println("Please, select a math operation:");
        System.out.println("1 - Sum");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        number2 = scanner.nextInt();
        return number2;
    }
}
