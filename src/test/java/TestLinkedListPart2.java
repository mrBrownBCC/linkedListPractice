
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestLinkedListPart2 {
    @Test
    public void testDeleteElement() {
        LinkedList list = new LinkedList();
        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        list.deleteElement(20);
        String expectedOutputAfterDelete = "10 -> 30 -> ";
        assertEquals(expectedOutputAfterDelete, captureTraverseOutput(list));

        list.deleteElement(10);
        String expectedOutputAfterSecondDelete = "30 -> ";
        assertEquals(expectedOutputAfterSecondDelete, captureTraverseOutput(list));

        list.deleteElement(30);
        String expectedOutputAfterThirdDelete = "";
        assertEquals(expectedOutputAfterThirdDelete, captureTraverseOutput(list));
    }

    @Test
    public void testLength() {
        LinkedList list = new LinkedList();
        assertEquals(0, list.length());

        list.insertAtHead(10);
        assertEquals(1, list.length());

        list.insertAtTail(20);
        list.insertAtTail(30);
        assertEquals(3, list.length());
    }

    // Helper method to capture the output of the traverse method using stdout redirection
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