package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatReflectiveOperationException;

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
    void whenMax8To2And4Then8() {
        int first = 2;
        int second = 4;
        int third = 8;
        int result = Max.max(first, second, third);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax24To3And6AndThird12Then24() {
        int first = 3;
        int second = 6;
        int third = 12;
        int forth = 24;
        int result = Max.max(first, second, third, forth);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }
}