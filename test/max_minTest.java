import org.junit.Test;
import static org.junit.Assert.*;

public class max_minTest {

    @Test
    public void max_test() {
        max_min tester = new max_min();
        int[] arr = {4,1,7,5,15,101,100,99,70};
        assertEquals(101,tester.max(arr));
    }

    @Test
    public void min_test() {
        max_min tester = new max_min();
        int[] arr = {4,1,7,5,15,101,100,99,70};
        assertEquals(1,tester.min(arr));
    }
}