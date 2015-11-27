package cn.bc.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MainTest {
    @Test
    public void testPlus() {
        Main a = new Main();
        int num = a.plus(3, 4);
        assertEquals(7, num);
    }
}
