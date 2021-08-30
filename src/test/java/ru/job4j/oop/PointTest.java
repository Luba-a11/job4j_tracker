package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;

import java.security.cert.PolicyNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.describedAs;

public class PointTest extends TestCase {
    @Test
    public void testDistance2() {
        Point a = new Point(0, 0, 5);
        Point b = new Point(0, 2, 3);
        Point z = new Point(8, 19, 45);
        double rsl = a.distance3d(b.distance3d(z));
        assertEquals (2, rsl, 0.01);
    }


}