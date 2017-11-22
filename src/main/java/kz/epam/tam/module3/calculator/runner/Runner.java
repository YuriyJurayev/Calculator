package kz.epam.tam.module3.calculator.runner;

import kz.epam.tam.module3.calculator.core.Calculator;
import kz.epam.tam.module3.calculator.utils.*;

public class Runner {

    public static void main(String[] args) {
        boolean calculation = true;
        int proceedOrExit = 1;
        Logger.printCalcStatus(proceedOrExit);
        while (calculation) {
            Logger.printProceedMenu();
            proceedOrExit = Reader.readData();
            if (proceedOrExit == 1) {
                Logger.printMainMenu();
                int operationType =  Reader.readData();
                switch (operationType) {
                    case 1:
                        CalcHelper.executeCalcOperation(operationType);
                        break;
                    case 2:
                        CalcHelper.executeCalcOperation(operationType);
                        break;
                    case 3:
                        CalcHelper.executeCalcOperation(operationType);
                        break;
                    case 4:
                        CalcHelper.executeCalcOperation(operationType);
                        break;
                    default:
                        Logger.printError();
                        break;
                }
            } else if (proceedOrExit == 2) {
                calculation = false;
                Logger.printCalcStatus(proceedOrExit);
            } else {
                Logger.printError();
            }
        }
    }

}