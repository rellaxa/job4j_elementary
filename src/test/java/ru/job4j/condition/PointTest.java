package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when510To1258Then48dot50() {
        double expected = 48.50;
        int x1 = 5;
        int y1 = 10;
        int x2 = 12;
        int y2 = 58;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when64minus128To256512Then668dot17() {
        double expected = 668.17;
        int x1 = 64;
        int y1 = -128;
        int x2 = 256;
        int y2 = 512;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}