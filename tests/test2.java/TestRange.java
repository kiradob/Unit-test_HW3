package seminars.third.hw.tests.test2.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RangeTest {
    private Range range;

    @BeforeEach
    public void createClassRange(){
        range = new Range();
    }
// Метод createClassRange() будет выполняться перед каждым запуском теста для создания экземпляра класса Range.
    @ParameterizedTest
    @ValueSource(ints = {26, 50 , 99})
    void numberInIntervalIsTrue(int number) {
        assertTrue(range.numberInInterval(number));
    }
// В методе numberInIntervalIsTrue используются значения {26, 50, 99}, и ожидается, что метод numberInInterval 
// вернет true для каждого из этих чисел.
    @ParameterizedTest
    @ValueSource(ints = {25, 100, -1, 1000})
    void numberInIntervalIsFalse(int number) {
        assertFalse(range.numberInInterval(number));
    }
}
// В методе numberInIntervalIsFalse используются значения {25, 100, -1, 1000}, и ожидается, 
// что метод numberInInterval вернет false для каждого из этих чисел.