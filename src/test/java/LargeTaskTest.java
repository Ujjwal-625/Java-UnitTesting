import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class LargeTaskTest {
    @Test
    @Timeout(value = 2, unit =TimeUnit.SECONDS)

    void mustrunlessthanTwoSeconds(){
        assertDoesNotThrow(() -> LargeTask.main(new String[]{}));
    }
}
