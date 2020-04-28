package pti.gyak;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testResult() {
        assertEquals(6.0, (new Calculator()).enter(5).enter(Operation.ADD).enter(1).getResult());
    }

    @Test
    public void testHistory() {
        assertEquals("5 + 1 = 6", (new Calculator()).enter(5).enter(Operation.ADD).enter(1).getHistory());
    }
    @Test
    public void testPOWRes() {
        assertEquals(25.0, (new Calculator()).enter(5).enter(Operation.POWER).enter(2).getResult());
    }
    @Test
    public void testPOWHis() {
        assertEquals("5 ^ 2 = 25", (new Calculator()).enter(5).enter(Operation.POWER).enter(2).getHistory());
    }

    @Test
    public void testSubRes() {
        assertEquals(3.0, (new Calculator()).enter(5).enter(Operation.SUBSTRACT).enter(2).getResult());
    }
    @Test
    public void testSubHis() {
        assertEquals("5 - 2 = 3", (new Calculator()).enter(5).enter(Operation.SUBSTRACT).enter(2).getHistory());
    }

    @Test
    public void testRem() {
        assertEquals(1.0, (new Calculator()).enter(5).enter(Operation.REMAINDER).enter(2).getResult());
    }

    @Test
    public void testClearRes() {
        assertEquals(0, (new Calculator()).enter(5).enter(Operation.REMAINDER).enter(2).enter(Operation.CLEAR).getResult());
    }

    @Test
    public void testMultiplyRes() {
        assertEquals(4.0, (new Calculator()).enter(2).enter(Operation.MULTIPLY).enter(2).getResult());
    }
    @Test
    public void testMultiplyHis() {
        assertEquals("2 * 2 = 4", (new Calculator()).enter(2).enter(Operation.MULTIPLY).enter(2).getHistory());
    }
    @Test
    public void testDivideRes() {
        assertEquals(4.0, (new Calculator()).enter(8).enter(Operation.DIVIDE).enter(2).getResult());
    }
    @Test
    public void testDivideHis() {
        assertEquals("8 / 2 = 4", (new Calculator()).enter(8).enter(Operation.DIVIDE).enter(2).getHistory());
    }

    @Test
    public void testGetResult()
    {
        assertEquals(0,(new Calculator().getResult()));
    }

    @Test
    public void testDivideWithZeroPositive() {assertEquals(Double.POSITIVE_INFINITY, (new Calculator().enter(3).enter(Operation.DIVIDE).enter(0)).getResult());}

    @Test
    public void testDivideWithZeroNegative() {assertEquals(Double.NEGATIVE_INFINITY, (new Calculator().enter(-3).enter(Operation.DIVIDE).enter(0)).getResult());}

    @Test
    public void testSQRT() {
        assertEquals(2.0, (new Calculator()).enter(4).enter(Operation.SQRT).getResult());
    }
    @Test
    public void testOperationNull() {
        Calculator test = new Calculator().enter(5).enter(Operation.ADD);
        Operation asd = null;
        assertThat(test, is( test.enter(asd)));
    }

    @Test
    public void testNumberNull() {
        Calculator test = new Calculator().enter(5).enter(Operation.ADD);
        Number asd = null;
        assertThat(test, is( test.enter(asd)));
    }
}