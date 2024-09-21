package pro.sky.calc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calc.service.CalcService;

@RestController
@RequestMapping(path = "/calculator")

public class CalcController {


    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }
    @GetMapping
    public String hello() {
        return calcService.helloCalc();
    }

    @GetMapping(path = "/plus")
    public String calcPlus(@RequestParam("num1") Integer numb1, @RequestParam("num2") Integer numb2) {
        return calcService.calcPlus(numb1,numb2);
    }

    @GetMapping(path = "/minus")
    public String calcMinus(@RequestParam("num1") Integer numb1, @RequestParam("num2") Integer numb2) {
        return calcService.calcMinus(numb1,numb2);
    }

    @GetMapping(path = "/multiply")
    public String calcMultiply(@RequestParam("num1") Integer numb1, @RequestParam("num2") Integer numb2) {
        return calcService.calcMultiply(numb1,numb2);
    }

    @GetMapping(path = "/divide")
    public String calcDivide(@RequestParam("num1") Integer numb1, @RequestParam("num2") Integer numb2) {
        return calcService.calcDivide(numb1, numb2);
    }

}
