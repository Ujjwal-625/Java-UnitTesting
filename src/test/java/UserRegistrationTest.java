import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void addingValidCredentials(){
        Assertions.assertTrue(UserRegistration.registerUser("SomeRandomUser","abc@gmail.com","&Yutu765uj"));
    }

    @Test
    void addingInvalidCredentials(){
        //added invalid mail
        Assertions.assertFalse(UserRegistration.registerUser("SomeRandomUser","abcgmail.com","&Yutu765uj"));

    }
}
