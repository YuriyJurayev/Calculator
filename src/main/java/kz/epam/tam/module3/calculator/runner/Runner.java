package kz.epam.tam.module3.calculator.runner;

import kz.epam.tam.module3.calculator.workflow.CalcManager;

public class Runner {

    public static void main(String[] args) {
        CalcManager calc = new CalcManager();
        calc.executeCalculator();
    }

}