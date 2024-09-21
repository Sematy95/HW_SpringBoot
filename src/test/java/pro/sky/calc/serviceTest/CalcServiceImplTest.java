package pro.sky.calc.serviceTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calc.exceptions.DivideZeroException;
import pro.sky.calc.service.CalcService;
import pro.sky.calc.service.CalcServiceImpl;

import java.lang.reflect.Executable;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcServiceImplTest {

    Random random = new Random();
    private final CalcService calcService = new CalcServiceImpl();

    @Test
    void getSum_WhenCorrectParam_ThenReturnCorrectResult() {

        int a = random.nextInt();
        int b = random.nextInt();
        String expected = a + " + " + b + " = " + (a + b);

        //when
        String actual = calcService.calcPlus(a, b);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void getSum_WhenNullParam() {
        assertThrows(IllegalArgumentException.class, () -> {
            calcService.calcPlus(null, 5);
        });
    }

    @ParameterizedTest
    @MethodSource("getDifferentParams")
    void param_getSum_WhenCorrectParam_ThenReturnCorrectResult(String message, Integer a, Integer b) {

        String expected = a + " + " + b + " = " + (a + b);

        //when
        String actual = calcService.calcPlus(a, b);

        //then
        assertEquals(expected, actual);
    }


    private static Stream<Arguments> getDifferentParams() {
        return Stream.of(
                Arguments.of("первое число о", 0, 50),
                Arguments.of("оба целочисленные положительные", 5, 10),
                Arguments.of("первое число отрицательное", -100, 2),
                Arguments.of("второе число отрицательное", 56, -100));
    }

    @Test
    void getMinus_WhenCorrectParam_ThenReturnCorrectResult() {
        int a = random.nextInt();
        int b = random.nextInt();
        String expected = a + " - " + b + " = " + (a - b);

        //when
        String actual = calcService.calcMinus(a, b);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void getMinus_WhenNullParam() {
        assertThrows(IllegalArgumentException.class, () -> {
            calcService.calcMinus(null, 5);
        });
    }

    @ParameterizedTest
    @MethodSource("getDifferentParams")
    void param_getMinus_WhenCorrectParam_ThenReturnCorrectResult(String message, Integer a, Integer b) {

        String expected = a + " - " + b + " = " + (a - b);

        //when
        String actual = calcService.calcMinus(a, b);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void getDivide_WhenCorrectParam_ThenReturnCorrectResult() {
        int a = random.nextInt();
        int b = random.nextInt();

        String expected = a + " / " + b + " = " + ((float) a / b);

        //when
        String actual = calcService.calcDivide(a, b);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void getDivide_WhenNullParam() {
        assertThrows(IllegalArgumentException.class, () -> {
            calcService.calcDivide(null, 5);
        });
    }

    @Test
    void getDivide_WhenSecondNumberIZero() {
        assertThrows(DivideZeroException.class, () -> {
            calcService.calcDivide(3, 0);
        });
    }

    @ParameterizedTest
    @MethodSource("getDifferentParams")
    void param_getDivide_WhenCorrectParam_ThenReturnCorrectResult(String message, Integer a, Integer b) {

        String expected = a + " / " + b + " = " + ((float) a / b);

        //when
        String actual = calcService.calcDivide(a, b);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void getMultiply_WhenCorrectParam_ThenReturnCorrectResult() {
        int a = random.nextInt();
        int b = random.nextInt();

        String expected = a + " * " + b + " = " + (a * b);

        //when
        String actual = calcService.calcMultiply(a, b);

        //then
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("getDifferentParams")
    void param_getMultiply_WhenCorrectParam_ThenReturnCorrectResult(String message, Integer a, Integer b) {

        String expected = a + " * " + b + " = " + (a * b);

        //when
        String actual = calcService.calcMultiply(a, b);

        //then
        assertEquals(expected, actual);
    }
}