package pti.gyak;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComplexTest {

    @Test
    public void testBalAg() {
        Complex complex = new Complex();
        assertEquals(354, complex.func(354, 400, 300));
    }

    @Test
    public void testBalKozepAg() {
        Complex complex = new Complex();
        assertEquals(-698, complex.func(698, 400, 300));
    }

    @Test
    public void testJobbTrue() {
        Complex complex = new Complex();
        assertEquals(300, complex.func(357, 400, 300));
    }

    @Test
    public void testJobbFalse() {
        Complex complex = new Complex();
        assertEquals(400, complex.func(358, 400, 500));
    }
}