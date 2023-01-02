import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


class Prime_numbersTest{
    @Test
    void testDivisibility(){
     //given
        boolean expResult = true;
        boolean expResult2 = false;

        int number = 5;
        int number2 = 4;
        int divisor = 2;

     //when
        boolean result = divisibility(number, divisor);
        boolean result2 = divisibility(number2, divisor);

     //then

        assertEquals(expResult, result);
        assertEquals(expResult2, result2);

    }
    boolean divisibility(int num, int div){
        return (num % div != 0);
    }

}