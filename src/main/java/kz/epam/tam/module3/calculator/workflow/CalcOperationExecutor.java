package kz.epam.tam.module3.calculator.workflow;

import kz.epam.tam.module3.calculator.core.Calculator;
import kz.epam.tam.module3.calculator.utils.CalcPrinter;
import kz.epam.tam.module3.calculator.utils.KeyboardReader;

class CalcOperationExecutor {

    void executeCalcOperation(int operationType){
        int operation = 0;
        String operator = "";
        CalcPrinter.printNumberSequence("first");
        int number1 = KeyboardReader.readInt();
        CalcPrinter.printNumberSequence("second");
        int number2 = KeyboardReader.readInt();
        Calculator calc = new Calculator();
        switch (operationType) {
            case 1:
                operation = calc.sum(number1, number2);
                operator = calc.SUM_OPERATOR;
                break;
            case 2:
                operation = calc.sub(number1, number2);
                operator = calc.SUB_OPERATOR;
                break;
            case 3:
                operation = calc.mult(number1, number2);
                operator = calc.MULT_OPERATOR;
                break;
            case 4:
                operation = calc.div(number1, number2);
                operator = calc.DIV_OPERATOR;
                break;
        }
        CalcPrinter.printResult(number1, number2, operator, operation);
    }
}
