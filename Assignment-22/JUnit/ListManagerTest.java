import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {
    ListManager manager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 5);
        assertEquals(1, list.size());
        assertTrue(list.contains(5));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        manager.removeElement(list, 5);
        assertFalse(list.contains(5));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        assertEquals(1, manager.getSize(list));
    }
}