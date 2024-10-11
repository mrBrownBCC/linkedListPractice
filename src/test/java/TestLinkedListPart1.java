
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestLinkedListPart1 {

    @Test
    public void testInsertAtHead() {
        LinkedList list = new LinkedList();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);

        // Traverse and check the expected order
        String expectedOutput = "30 -> 20 -> 10 -> ";
        System.out.println((captureTraverseOutput(list)));
        assertEquals(expectedOutput, captureTraverseOutput(list));
    }

    @Test
    public void testInsertAtTail() {
        LinkedList list = new LinkedList();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        // Traverse and check the expected order
        String expectedOutput = "10 -> 20 -> 30 -> ";
        assertEquals(expectedOutput, captureTraverseOutput(list));
    }

    @Test
    public void testContainsElement() {
        LinkedList list = new LinkedList();
        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        assertTrue(list.containsElement(10));
        assertTrue(list.containsElement(20));
        assertTrue(list.containsElement(30));
        assertFalse(list.containsElement(40));
    }

    private String captureTraverseOutput(LinkedList list) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        list.traverse();

        System.out.flush();
        System.setOut(originalOut);
        return outputStream.toString();
    }
}