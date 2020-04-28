package pti.gyak;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleTest {

    @Test
    public void testBalAg() {
        Simple simple = new Simple();
        assertEquals(354, simple.func(354, 400, 300));
    }

    @Test
    public void testBalKozepAg() {
        Simple simple = new Simple();
        assertEquals(-698, simple.func(698, 400, 300));
    }

    @Test
    public void testJobbTrue() {
        Simple simple = new Simple();
        assertEquals(300, simple.func(355, 400, 300));
    }
}