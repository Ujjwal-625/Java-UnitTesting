import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    @Test

    void isValidTrue(){
        Assertions.assertTrue(PasswordValidator.validPassword("@Abcdfe652"));
    }
    @Test
    void isValidfalse(){
        Assertions.assertFalse(PasswordValidator.validPassword("qAbcdfe652"));
    }
}
