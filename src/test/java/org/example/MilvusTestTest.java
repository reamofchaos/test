package org.example;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MilvusTestTest extends TestCase {

    MilvusTest test;
    @Before
    public void setUp() {
        test = new MilvusTest();
        try {
            test.create();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @After
    public void tearDown() {
        test.close();
    }


//    @Test
//    public void testInsert() throws InterruptedException {
//        long r = test.insert();
//        assertEquals(r, 10);
//    }

    @Test
    public void testSearch() throws InterruptedException {
        long r = test.insert();
        assertEquals(r, 10);
        r= test.search();
        assertEquals(r, 10);
    }
}