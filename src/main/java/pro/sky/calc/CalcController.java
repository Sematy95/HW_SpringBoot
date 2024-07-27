package pro.sky.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return calcService.helloCalc();
    }

    @GetMapping(path = "/calculator/plus")
    public String calcPlus(@RequestParam(value = "num1", required = false) Integer numb1,
                           @RequestParam(value = "num2", required = false) Integer numb2) {
        if (numb1 == null || numb2 == null) {
            return "Не передан параметр";
        } else {
            return calcService.calcPlus(numb1, numb2);
        }
    }

    @GetMapping(path = "/calculator/minus")
    public String calcMinus(@RequestParam(value = "num1", required = false) Integer numb1,
                            @RequestParam(value = "num2", required = false) Integer numb2) {
        if (numb1 == null || numb2 == null) {
            return "Не передан параметр";
        } else {
            return calcService.calcMinus(numb1, numb2);
        }
    }

    @GetMapping(path = "/calculator/multiply")
    public String calcMultiply(@RequestParam(value = "num1", required = false) Integer numb1,
                               @RequestParam(value = "num2", required = false) Integer numb2) {
        if (numb1 == null || numb2 == null) {
            return "Не передан параметр";
        } else {
            return calcService.calcMultiply(numb1, numb2);
        }
    }

    @GetMapping(path = "/calculator/divide")
    public String calcDivide(@RequestParam(value = "num1", required = false) Integer numb1,
                             @RequestParam(value = "num2", required = false) Integer numb2) {
        if (numb1 == null || numb2 == null) {
            return "Не передан параметр";
        } else {
            return calcService.calcDivide(numb1, numb2);
        }
    }
}


