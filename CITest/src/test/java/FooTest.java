//package com.themis.citest2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link Foo}.
 *
 * @author user@example.com (John Doe)
 */
@RunWith(JUnit4.class)
public class FooTest {

    @Test
    public void thisAlwaysPasses() {
        assertEquals(true, true);
    }

    @Test
    @Ignore
    public void thisIsIgnored() {
    }
}
