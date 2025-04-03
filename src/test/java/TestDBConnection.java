import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDBConnection {
    private DBConnection db;
    @BeforeEach
    void initializeConnection(){
        db=new DBConnection();
        db.connectToDb();
    }

    @AfterEach
    void disconnectDBConnection(){
        db.disconnectDB();
    }

    @Test
    void testingConnectionToDB(){
        Assertions.assertTrue(db.isConnectedToDb());
    }

    @Test
    void testingDisconnectToDB(){
        db.disconnectDB();
        Assertions.assertTrue(!db.isConnectedToDb());
    }
}
