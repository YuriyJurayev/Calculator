package kz.epam.tam.module3.calculator.utils;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardReader {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInt() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                CalcPrinter.printError();
                scanner.nextLine();
            }
        }
    }
}


