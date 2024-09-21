package pro.sky.calc.service;

import org.springframework.stereotype.Service;
import pro.sky.calc.exceptions.DivideZeroException;

@Service
public class CalcServiceImpl implements CalcService {

    public String helloCalc() {
        return "Добро пожаловать в калькулятор";
    }

    public String calcPlus(int numb1, int numb2) {
        int sum = numb1 + numb2;
        String answer = numb1 + " + " + numb2 + " = " + sum;
        return answer;
    }


    public String calcMinus(int numb1, int numb2) {
        int sum = numb1 - numb2;
        String answer = numb1 + " - " + numb2 + " = " + sum;
        return answer;
    }


    public String calcMultiply(int numb1, int numb2) {
        int result = numb1 * numb2;
        String answer = numb1 + " * " + numb2 + " = " + result;
        return answer;
    }


    public String calcDivide(int numb1, int numb2) {
        String answer;
        if (numb2 == 0) {
            throw new DivideZeroException();
        } else {
            float result = (float) numb1 / numb2;
            answer = numb1 + " / " + numb2 + " = " + result;
        } return answer;
    }
}
