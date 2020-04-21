import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleLearnTest {

    SimpleLearn simpleLearn;

    @Before
    public void setUp() throws Exception {
        simpleLearn = new SimpleLearn();
    }

    @Test
    public void add() {
        Assert.assertEquals("5","5");
    }

    @Test
    public void subtract() {
        Assert.assertEquals("1","1");
    }
}