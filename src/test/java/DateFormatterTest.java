import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

public class DateFormatterTest {
    @Test
    void testDateFormater() throws ParseException {
        Assertions.assertEquals("09-08-2002",DateFormatter.formatDate("2002-08-09"));
    }

    @Test
    void testInvalidFormat() throws ParseException{
        Assertions.assertThrows(ParseException.class,()->{
            DateFormatter.formatDate("09-08-2002");
        });
    }
}
