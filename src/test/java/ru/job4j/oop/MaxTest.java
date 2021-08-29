package ru.job4j.oop;

import junit.framework.TestCase;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest extends TestCase {

        public void testTestMax() {
            int max = Max.max(356, 11, 8797, 87);
            assertThat(max, is(8797));
    }
}