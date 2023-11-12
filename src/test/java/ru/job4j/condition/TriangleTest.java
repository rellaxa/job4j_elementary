package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void whenExist() {
        int ab = 5;
        int ac = 6;
        int bc = 9;
        boolean rsl = Triangle.exist(ab, ac, bc);
        assertThat(rsl).isTrue();
    }

    @Test
    void whenNotExist() {
        int ab = 5;
        int ac = 2;
        int bc = 3;
        boolean rsl = Triangle.exist(ab, ac, bc);
        assertThat(rsl).isFalse();
    }
}