package ru.job4j.oop;

import junit.framework.TestCase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class PointTest extends TestCase {

    public void testDistance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double rsl = a.distance(b);
        double expected = 8.246211251235321;
        assertThat (rsl, closeTo(8, 0.001));
    }
}