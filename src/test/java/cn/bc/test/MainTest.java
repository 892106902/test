package cn.bc.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MainTest {
    //测试plus方法
    @Test
    public void testPlus() {
        assertEquals(7,Main.plus(3,4));
    }
}
