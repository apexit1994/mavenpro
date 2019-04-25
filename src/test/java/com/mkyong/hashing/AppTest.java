package com.mkyong.hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

        @Test
        public void testSeriousness() throws Exception {
            App tester = new App(); // MyClass is tested
            // assert statements
            Assertions.assertEquals(10, tester.add(10, 0));
        }
}