import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {  // Remove 'public' (JUnit 5 does not require public classes)

    @Test
    void fourPlusSevenEqualsEleven() {
        Calculator calculator = new Calculator();
        assertEquals(11, calculator.add(4, 7));
    }

    @Test
    void fourMinusFourEqualsZero(){
        Calculator calculator=new Calculator();
        assertEquals(0,calculator.sub(4,4));
    }

    @Test
    void fourMultiplyFourEqualsSixTeen(){
        Calculator calculator=new Calculator();
        assertEquals(16,calculator.multiply(4,4));
    }

    @Test
    void eightDivideByFourEqaulsTwo(){
        Calculator calculator=new Calculator();
        assertEquals(2,calculator.division(8,4));
    }

    @Test
    void canNotDivideByZero(){
        Calculator calculator=new Calculator();
        assertThrows(ArithmeticException.class,()->{
            calculator.division(4,0);
        });
    }
}
