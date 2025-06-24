package org.example.test01.OnTap1.Utils;

import org.example.test01.OnTap1.Utils.MyUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilsTest {
    private MyUtils myUtils;

    @BeforeEach
    void setUp() {
        myUtils = new MyUtils();
    }

    @Test
    void add() {
        assertEquals(5 , myUtils.add(2,3));
    }

    @Test
    void sub() {
        assertEquals(1,myUtils.sub(3,2));
    }
}