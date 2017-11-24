package kz.epam.tam.module3.calculator.utils;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardReader {

    private static Scanner scanner = new Scanner(System.in);

    public static int readInt() {
        boolean isInputIncorrect = true;
        int number =0;
        while (isInputIncorrect){
            try {
                number = scanner.nextInt();
                isInputIncorrect = false;
            }catch (InputMismatchException e){
                CalcPrinter.printError();
                scanner.nextLine();
            }
        }
        return number;
    }
}
