package kz.epam.tam.module3.calculator.utils;

public class MultHelper extends Helper {

    public void multiplication(){
        System.out.println("Division");
        System.out.println(firstNumber);
        number1 = scanner.nextInt();
        System.out.println(secondNumber);
        number2 = scanner.nextInt();
        System.out.println("Result: " + number1 + " / " + number2 + " = " + calc.mult(number1, number2));
    }
}
