import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TempreatureConverterTest {
    @Test

    void thirtyDegreeEqualsEightysix(){
        Assertions.assertEquals(86.0,TempreatureConverter.celciusToFahrenheit(30));
    }

    @Test
    void HundredDegreeEqualsThirtySevenDegree(){
        Assertions.assertEquals(37.77777777777778,TempreatureConverter.fahrenheitToCelcius(100));
    }
}
