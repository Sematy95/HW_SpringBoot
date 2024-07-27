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
    public String calcPlus(@RequestParam("num1") int numb1, @RequestParam("num2") int numb2) {
        return calcService.calcPlus(numb1,numb2);
    }

    @GetMapping(path = "/calculator/minus")
    public String calcMinus(@RequestParam("num1") int numb1, @RequestParam("num2") int numb2) {
        return calcService.calcMinus(numb1,numb2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String calcMultiply(@RequestParam("num1") int numb1, @RequestParam("num2") int numb2) {
        return calcService.calcMultiply(numb1,numb2);
    }

    @GetMapping(path = "/calculator/divide")
    public String calcDivide(@RequestParam("num1") int numb1, @RequestParam("num2") int numb2) {
        return calcService.calcDivide(numb1, numb2);
    }

}
