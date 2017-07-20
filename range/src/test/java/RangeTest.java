import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RangeTest {

    @Test
    public void
    FirstSign1Test() {
        MyRange range = new MyRange();
        boolean actualResult = range.FirstSign("[1,5]");
        assertTrue("Must True", actualResult);
    }

    @Test
    public void
    FirstSign2Test() {
        MyRange range = new MyRange();
        boolean actualResult = range.FirstSign("(1,5]");
        assertFalse("Must False", actualResult);
    }

    @Test
    public void
    FirstNum1Test() {
        MyRange range = new MyRange();
        int actualResult = range.getFirstNumber("[1,5]");
        assertEquals(1, actualResult);
    }

    @Test
    public void
    FirstNum2Test() {
        MyRange range = new MyRange();
        int actualResult = range.getFirstNumber("[2,5]");
        assertEquals(2, actualResult);
    }

    @Test
    public void
    FirstNum3Test() {
        MyRange range = new MyRange();
        int actualResult = range.getFirstNumber("(1,5]");
        assertEquals(2, actualResult);
    }

    @Test
    public void
    EndSign1Test() {
        MyRange range = new MyRange();
        boolean actualResult = range.EndSign("[1,5]");
        assertTrue("Must True", actualResult);
    }

    @Test
    public void
    EndSign2Test() {
        MyRange range = new MyRange();
        boolean actualResult = range.EndSign("[1,5)");
        assertFalse("Must False", actualResult);
    }

    @Test
    public void
    EndNum1Test() {
        MyRange range = new MyRange();
        int actualResult = range.getLastNumber("[1,5]");
        assertEquals(5, actualResult);
    }

    @Test
    public void
    EndNum2Test() {
        MyRange range = new MyRange();
        int actualResult = range.getLastNumber("[1,5)");
        assertEquals(4, actualResult);
    }

    @Test @Ignore
    public void final_problem() {
        MyRange range = new MyRange();
        assertEquals("12345", range.of("[1,5]"));
        assertEquals("1234", range.of("[1,5)"));
        assertEquals("2345", range.of("(1,5]"));
        assertEquals("234", range.of("(1,5)"));
    }

}

