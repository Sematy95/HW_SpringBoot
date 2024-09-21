package pro.sky.calc.service;

import org.springframework.stereotype.Service;
import pro.sky.calc.exceptions.DivideZeroException;

@Service
public class CalcServiceImpl implements CalcService {

    public String helloCalc() {
        return "Добро пожаловать в калькулятор";
    }

    public String calcPlus(Integer numb1, Integer numb2) {
        if (numb1 == null || numb1 == null) throw new IllegalArgumentException();
        Integer sum = numb1 + numb2;
        String answer = numb1 + " + " + numb2 + " = " + sum;
        return answer;
    }


    public String calcMinus(Integer numb1, Integer numb2) {
        if (numb1 == null || numb1 == null) throw new IllegalArgumentException();
        int sum = numb1 - numb2;
        String answer = numb1 + " - " + numb2 + " = " + sum;
        return answer;
    }


    public String calcMultiply(Integer numb1, Integer numb2) {
        if (numb1 == null || numb1 == null) throw new IllegalArgumentException();
        int result = numb1 * numb2;
        String answer = numb1 + " * " + numb2 + " = " + result;
        return answer;
    }


    public String calcDivide(Integer numb1, Integer numb2) {
        if (numb1 == null || numb1 == null) throw new IllegalArgumentException();
        String answer;
        if (numb2 == 0) {
            throw new DivideZeroException();
        } else {
            float result = (float) numb1 / numb2;
            answer = numb1 + " / " + numb2 + " = " + result;
        }
        return answer;
    }
}
