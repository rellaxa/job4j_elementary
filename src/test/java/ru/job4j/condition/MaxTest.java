package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To3Then10() {
        int left = 10;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax999To999Then2() {
        int left = 999;
        int right = 999;
        int result = Max.max(left, right);
        int expected = 999;
        assertThat(result).isEqualTo(expected);
    }
}