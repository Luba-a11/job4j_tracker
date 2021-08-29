package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.describedAs;

public class PointTest extends TestCase {
    @Test
    public void testDistance2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double rsl = a.distance(b);
        assertEquals (2, rsl, 0.01);
    }

    @Test
    public void testDistance15() {
        Point a = new Point(2, 7);
        Point b = new Point(-8, 19);
        double rsl = a.distance(b);
        assertEquals(15.62, rsl, 0.01);

    }

    @Test
    public void testDistance1103() {
        Point a = new Point(-125, -98);
        Point b = new Point(85, 985);
        double rsl = a.distance(b);
        assertEquals(1103.17, rsl, 0.01 );
    }

}