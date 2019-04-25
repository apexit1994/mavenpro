package com.mkyong.hashing;


import junit.framework.TestCase;

public class AppTest extends TestCase {

        public AppTest(String name) {
            super( name );
        }

        public void testSeriousness() throws Exception {
            App tester = new App(); // MyClass is tested
            // assert statements
            assertEquals(10, tester.add(10, 0));
        }
}