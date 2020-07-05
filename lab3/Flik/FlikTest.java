import static org.junit.Assert.*;
import org.junit.Test;

public class FlikTest {

    @Test
    public void testIsSameNumber() {
        Integer a = 200;
        Integer b = 200;
        boolean exp = Flik.isSameNumber(a, b);
        assertTrue("Test Passed!", exp);
    }

}
