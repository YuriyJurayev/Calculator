package kz.epam.tam.module3.calculator.workflow;

import kz.epam.tam.module3.calculator.utils.CalcPrinter;
import kz.epam.tam.module3.calculator.utils.KeyboardReader;

public class CalcManager {

    public void executeCalculator(){
        CalcOperationExecutor executor = new CalcOperationExecutor();
        boolean calculation = true;
        int proceedOrExit = 1;
        CalcPrinter.printCalcStatus(proceedOrExit);
        while (calculation) {
            CalcPrinter.printProceedMenu();
            proceedOrExit = KeyboardReader.readInt();
            switch (proceedOrExit) {
                case 1:
                    CalcPrinter.printMainMenu();
                    int operationType = KeyboardReader.readInt();
                    executor.executeCalcOperation(operationType);
                    break;
                case 2:
                    calculation = false;
                    CalcPrinter.printCalcStatus(proceedOrExit);
                    break;
                default:
                    CalcPrinter.printError();
                    break;
            }
            /*if (proceedOrExit == 1) {
                CalcPrinter.printMainMenu();
                int operationType = KeyboardReader.readInt();
                executor.executeCalcOperation(operationType);
            } else if (proceedOrExit == 2) {
                calculation = false;
                CalcPrinter.printCalcStatus(proceedOrExit);
            } else {
                CalcPrinter.printError();
            }*/

        }
    }
}
