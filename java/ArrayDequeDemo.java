import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo
{
    public static void main(String[] args)
    {

        // Create a Deque of Strings
        Deque<String> d = new ArrayDeque<>();

        d.addFirst("1");
        d.addLast("2");

        String f = d.removeFirst();
        String l = d.removeLast();

        // Displaying the Deque
        System.out.println("First: " + f + ", Last: " + l);
    }
}
/*
 *The Deque interface is a part of the java.util package and extends the Queue interface. It stands for Double-Ended Queue, and represents a linear collection that allows insertion, removal, and retrieval of elements from both ends

Flexible Data Structure: Can be used as a stack (LIFO) or a queue (FIFO).
Null Elements Not Allowed: Some implementations, like ArrayDeque, do not allow null.
Resizable Implementations: Implementations like ArrayDeque grow dynamically as needed.
Thread Safety: Most implementations are not thread-safe; synchronization is required for concurrent use.
*/