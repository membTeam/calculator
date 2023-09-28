package calc314.controller;

import org.springframework.stereotype.Component;

@Component
public class CalculatorServEmpl implements CalculatorServ {

    public ResultMethod verifyNumber(String name, Integer value) {

        if (value == null) {
            return new ResultMethod(name + " значение null");
        } else if (value == 0) {
            return new ResultMethod(name + " д/быть больше нуля");
        } else {
            return new ResultMethod();
        }
    }

    public ResultMethod verifyParams(Integer num1, Integer num2) {
        var verfNum1 = verifyNumber("num1", num1);
        var verfNum2 = verifyNumber("num2", num2);

        if (verfNum1.isResult() && verfNum2.isResult()) {
            return new ResultMethod();
        } else {
            if (!verfNum1.isResult() && !verfNum2.isResult()) {
                return new ResultMethod(verfNum1.getMessageErr() + " " + verfNum2.getMessageErr());
            } else {
                if (!verfNum1.isResult()) {
                    return new ResultMethod(verfNum1.getMessageErr());
                } else {
                    return new ResultMethod((verfNum2.getMessageErr()));
                }
            }
        }
    }

    public String operationResult(EOperation eOperation, Integer num1, Integer num2) {

        var verify = verifyParams(num1, num2);

        if (!verify.isResult()) {
            return verify.getMessageErr();
        }

        int resultOperation = switch (eOperation) {
            case PLUS -> num1 + num2;
            case MINUS -> num1 - num2;
            case MULTIPLY -> num1 * num2;
            case DIVIDE -> num1 / num2;
        };

        return String.format("%s двух чисел: %d и %d = %d", eOperation.getMethod(), num1, num2, resultOperation);
    }

}
