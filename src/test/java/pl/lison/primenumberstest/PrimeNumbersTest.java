package pl.lison.primenumberstest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class PrimeNumbersTest {
    @Test
    void shouldRestOfTheDivisionTrue() {
        //given
        boolean expResult = true;


        int number = 5;
        int divisor = 2;

        //when
        boolean result = divisibility(number, divisor);


        //then

        assertEquals(expResult, result);
    }

    @Test
    void shouldRestOfTheDivisionFalse() {
        int number2 = 4;
        int divisor = 2;
        boolean expResult2 = false;

        boolean result2 = divisibility(number2, divisor);


        assertEquals(expResult2, result2);

    }

    boolean divisibility(int num, int div) {
        return (num % div != 0);
    }

}