import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestIsEvenNumber {
    @ParameterizedTest
//    @ValueSource(ints = {2,3,4,5})
    @CsvSource({"2","4","6","8"})
    public void shouldTestEvenNumber(int number){
        EvenNumber e = new EvenNumber();
        boolean ans = e.isEven(number);
        assertTrue(ans, "Expected " + number + " to be even, but it was not.");
    }

    @ParameterizedTest
    @ValueSource(ints = {5,6,7,8,9})
    public void testEvenNumber(int e){
        EvenNumber num=new EvenNumber();
        boolean ans = num.isEven(e);
        if (e % 2 == 0) {
            assertTrue(ans, "Expected " + e + " to be even, but it was not.");
        } else {
            assertFalse(ans, "Expected " + e + " to be odd, but it was detected as even.");
        }

    }

}
