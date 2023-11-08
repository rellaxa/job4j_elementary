package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP4K1Square2() {
        int p = 4;
        double k = 1;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(1, withPrecision(0.01));
    }

    @Test
    void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(2, withPrecision(0.01));
    }

    @Test
    void whenP10K8dot5Square2dot39() {
        int p = 10;
        double k = 8.5;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(2.35, withPrecision(0.01));
    }
}