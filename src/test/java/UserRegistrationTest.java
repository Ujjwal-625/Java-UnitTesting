import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void addingValidCredentials(){
        try {
            Assertions.assertTrue(UserRegistration.registerUser("SomeRandomUser","abc@gmail.com","&Yutu765uj"));

        }
        catch (IllegalAccessException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void addingInvalidCredentials(){
        //added invalid mail
           Assertions.assertThrows(IllegalAccessException.class,()->{
               UserRegistration.registerUser("fkjsdkll","kfljskjf.com","jfkljskld");
           });

    }
}
