import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BackAccountTest {

    @BeforeEach
    void setup(){
        BankAccount.setBalance();
    }
    @Test
    void testDeposit(){
        BankAccount.deposit(50);
        Assertions.assertEquals(150,BankAccount.getBalance());
    }

    @Test
    void testWithdraw() throws Exception{
        BankAccount.withdrawl(50);
        Assertions.assertEquals(50, BankAccount.getBalance());
    }

    @Test
    void overWithdrawlException(){
        Exception e=Assertions.assertThrows(Exception.class,()->{
            BankAccount.withdrawl(200);
        });
        Assertions.assertEquals("Amount can not be greater than Balance", e.getMessage());
    }
}
