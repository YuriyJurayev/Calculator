package kz.epam.tam.module3.calculator.utils;


import java.util.Scanner;

public class Reader {

    private static int number;
    private static Scanner scanner = new Scanner(System.in);

    public static int readData() {
        number = scanner.nextInt();
        return number;
    }
}
