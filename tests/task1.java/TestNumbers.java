package seminars.third.hw.tests.task1.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TestNumbers {

    private Numbers numbers;

    @BeforeEach
    public void createNumbersClass(){
        numbers =new Numbers();
    }
// В методе createNumbersClass() с помощью аннотации @BeforeEach создается новый объект Numbers перед каждым тестовым методом.

    @ParameterizedTest
    @ValueSource (ints = {2, 20, 66})
    void CheckEvenOddNumberTrue(int number) {
        assertTrue(numbers.CheckEvenOddNumber(number));
    }
// В методе CheckEvenOddNumberTrue(int number) с помощью аннотации @ParameterizedTest и @ValueSource задается набор целочисленных
// значений, для которых должно выполняться утверждение assertTrue(numbers.CheckEvenOddNumber(number)).
    @ParameterizedTest
    @ValueSource (ints = {1, 29, 101})
    void CheckEvenOddNumberFalse(int number) {
        assertFalse(numbers.CheckEvenOddNumber(number));
    }
}
// в методе evenOddNumberCheckFalse(int number) с помощью аннотации @ParameterizedTest и @ValueSource задается набор целочисленных
// значений, для которых должно выполняться утверждение assertFalse(numbers.CheckEvenOddNumber(number)).