package org.example.test01.OnTap2.Utils;

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
    void tinhTongSoLe() {
        assertEquals(16 ,  myUtils.tinhTongSoLe(7));
    }
}