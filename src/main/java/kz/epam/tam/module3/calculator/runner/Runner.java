package kz.epam.tam.module3.calculator.runner;

import kz.epam.tam.module3.calculator.utils.*;

public class Runner {

    public static void main(String[] args) {
        boolean calculation = true;
        System.out.println("Calculator is started!");

        while (calculation) {
            MenuHelper menu = new MenuHelper();
            int proceedOrExit = menu.pickProceedOrExit();
            if (proceedOrExit == 1) {
                int operationType = menu.pickOne();
                switch (operationType) {
                    case 1:
                        SumHelper sumHelper = new SumHelper();
                        sumHelper.sum();
                        break;
                    case 2:
                        SubHelper subHelper = new SubHelper();
                        subHelper.substraction();
                        break;
                    case 3:
                        MultHelper multHelper = new MultHelper();
                        multHelper.multiplication();
                        break;
                    case 4:
                        DivHelper divHelper = new DivHelper();
                        divHelper.division();
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