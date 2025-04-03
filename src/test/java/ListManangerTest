import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ListManagerTest {
    private ListManager listManager;
    private List <Integer> list;

    @BeforeEach
    void setup(){
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    public void shouldAddElementToList(){
        listManager.addElement(list,5);
        listManager.addElement(list,6);
        listManager.addElement(list,7);

        Assertions.assertEquals(3,list.size());
        Assertions.assertTrue(list.contains(5));

    }
    @Test
    public void shouldRemoveElementFromList(){
        listManager.addElement(list,5);
        listManager.addElement(list,6);
        listManager.addElement(list,7);
        boolean a = listManager.removeElement(list,5);
        Assertions.assertTrue(a);


    }

    @Test
    public void shouldGetLengthOfList(){
        listManager.addElement(list,5);
        listManager.addElement(list,6);
        int n = listManager.getLength(list);
        Assertions.assertEquals(2,n);
    }
}