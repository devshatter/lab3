import static org.junit.Assert.*;


import org.junit.*;

public class LinkedListTest {
    @Test
    public void firstTest() {
        LinkedList list = new LinkedList();
        list.append(3);
        assertEquals(3, list.first());
    }
    @Test
    public void prependTest() {
        LinkedList list = new LinkedList();
        list.prepend(3);
        list.prepend(2);
        assertEquals(2, list.root.value);
        assertEquals(3, list.root.next.value);
    }

    @Test
    public void appendTest() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(1);
        list.append(5);
        int[] output = {1, 1, 5};
        Node node = list.root;
        for (int i = 0; i < 3; i ++) {
            assertEquals(output[i], node.value);
            node = node.next;
        }
    }

    @Test
    public void lastTest() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(1);
        list.append(5);
        assertEquals(5, list.last());
    }

    @Test
    public void toStringTest() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(1);
        list.append(5);
        assertEquals("1 1 5 ", list.toString());
    }

    public void lengthTest() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(1);
        list.append(5);
        assertEquals(3, list.length());

        LinkedList empty = new LinkedList();
        assertEquals(0, empty.length());
    }
}
