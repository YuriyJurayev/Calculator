package kz.epam.tam.module3.calculator.utils;

public class SumHelper extends Helper {

    public void sum() {
        System.out.println("Sum");
        System.out.println(firstNumber);
        number1 = scanner.nextInt();
        System.out.println(secondNumber);
        number2 = scanner.nextInt();
        System.out.println("Result: " + number1 + " + " + number2 + " = " + calc.sum(number1, number2));
    }
}
