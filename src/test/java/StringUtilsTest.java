import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    @Test
    void reverseOfYellowEqualswolleY(){
        StringUtils str=new StringUtils();

        Assertions.assertEquals("wolleY", str.reverseString("Yellow"));
    }

    @Test
    void iTopiNonAvevanoNipotiIsNotAPalindrome(){
        StringUtils str=new StringUtils();

        Assertions.assertFalse(str.isPalindrome("iTopiNonAvevanoNipoti"));
    }
    @Test
    void illiIsAPalindrome(){
        StringUtils str=new StringUtils();

        Assertions.assertTrue(str.isPalindrome("illi"));
    }

    @Test

    void ujjwalEqualsUJJWAL(){
        StringUtils str=new StringUtils();

        Assertions.assertEquals("UJJWAL",str.stringToUpperCase("Ujjwal"));
    }
}
