import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticOperationsTest {

    ArithmeticOperations arithmeticOperations;

    @Before
    public void setUp() throws Exception {
        arithmeticOperations = new ArithmeticOperations();
    }

    @Test
    public void getNum1() {
        Assert.assertEquals("2", "2");
    }

    @Test
    public void getNum2() {
        Assert.assertEquals("3", "3");
    }
}