import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestDivideByZero {
    @Test
    void canNotDivideByZero(){
        Calculator calculator=new Calculator();
        assertThrows(ArithmeticException.class,()->{
            calculator.division(4,0);
        });
    }
}
