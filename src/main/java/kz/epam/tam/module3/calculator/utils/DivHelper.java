package kz.epam.tam.module3.calculator.utils;

public class DivHelper extends Helper {

    public void division(){
        System.out.println("Division");
        System.out.println(firstNumber);
        number1 = scanner.nextInt();
        System.out.println(secondNumber);
        number2 = scanner.nextInt();
        System.out.println("Result: " + number1 + " / " + number2 + " = " + calc.div(number1, number2));
    }
}
