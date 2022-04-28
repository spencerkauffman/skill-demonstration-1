import static org.junit.Assert.*;
import org.junit.*;
 
public class MyExampleTester {
    MyExample myExample = new MyExample();
    @Test
    public void testSum() {
        assertEquals(4, myExample.sum);
    }
}