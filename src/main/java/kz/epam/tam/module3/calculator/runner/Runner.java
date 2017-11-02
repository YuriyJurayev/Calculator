package kz.epam.tam.module3.calculator.runner;

import kz.epam.tam.module3.calculator.Calculator;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        boolean calculation = true;
        int number1;
        int number2;

        Calculator calc = new Calculator();
        System.out.println("Calculator is started!");
        Scanner scanner = new Scanner(System.in);

        while (calculation) {
            System.out.println("Would you like to Proceed?");
            System.out.println("1 - Proceed ");
            System.out.println("2 - Exit ");
            int proceedOrExit = scanner.nextInt();

            if (proceedOrExit == 1) {
                System.out.println("Please, select a math operation:");
                System.out.println("1 - Sum");
                System.out.println("2 - Subtraction");
                System.out.println("3 - Multiplication");
                System.out.println("4 - Division");
                int operationType = scanner.nextInt();

                switch (operationType) {
                    case 1:
                        System.out.println("Sum");
                        System.out.println("Please enter the first number!");
                        number1 = scanner.nextInt();
                        System.out.println("Please enter the second number!");
                        number2 = scanner.nextInt();
                        System.out.println("Sum: " + number1 + " + " + number2 + " = " + calc.sum(number1, number2));
                        break;
                    case 2:
                        System.out.println("Subtraction");
                        System.out.println("Please enter the first number!");
                        number1 = scanner.nextInt();
                        System.out.println("Please enter the second number!");
                        number2 = scanner.nextInt();
                        System.out.println("Result: " + number1 + " - " + number2 + " = " + calc.sub(number1, number2));
                        break;
                    case 3:
                        System.out.println("Multiplication");
                        System.out.println("Please enter the first number!");
                        number1 = scanner.nextInt();
                        System.out.println("Please enter the second number!");
                        number2 = scanner.nextInt();
                        System.out.println("Result: " + number1 + " * " + number2 + " = " + calc.mult(number1, number2));
                        break;
                    case 4:
                        System.out.println("Division");
                        System.out.println("Please enter the first number!");
                        number1 = scanner.nextInt();
                        System.out.println("Please enter the second number!");
                        number2 = scanner.nextInt();
                        System.out.println("Result: " + number1 + " / " + number2 + " = " + calc.div(number1, number2));
                        break;
                    default:
                        System.out.println("Incorrect value! Please, try again");
                        break;
                }
            } else if (proceedOrExit == 2) {
                calculation = false;
                System.out.println("Calculator is closed!");
            } else {
                System.out.println("Incorrect value! Please, try again");
            }
        }
    }

}