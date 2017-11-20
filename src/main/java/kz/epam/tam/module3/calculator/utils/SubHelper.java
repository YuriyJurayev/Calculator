package kz.epam.tam.module3.calculator.utils;

public class SubHelper extends Helper {

    public void substraction (){
        System.out.println("Subtraction");
        System.out.println(firstNumber);
        number1 = scanner.nextInt();
        System.out.println(secondNumber);
        number2 = scanner.nextInt();
        System.out.println("Result: " + number1 + " - " + number2 + " = " + calc.sub(number1, number2));
    }
}
