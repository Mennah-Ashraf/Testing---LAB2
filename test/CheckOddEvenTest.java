import org.junit.Test;

import static org.junit.Assert.*;

public class CheckOddEvenTest {

    @Test
    public void odd_num() {
        CheckOddEven tester = new CheckOddEven();
        assertEquals(true,tester.Odd(5));
    }

    @Test
    public void even_num() {
        CheckOddEven tester = new CheckOddEven();
        assertEquals(false,tester.Odd(8));
    }
}