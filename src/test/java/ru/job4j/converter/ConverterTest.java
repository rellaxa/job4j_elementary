package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert1500RblThen15Euro() {
        float in = 1500;
        float expected = 15;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert1500RblThen15dot9574() {
        float in = 1500;
        float expected = 15.9574f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert300DolThen282Euro() {
        float in = 300;
        float expected = 282;
        float out = Converter.dollarToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert300EuroThen317dot9999Doll() {
        float in = 300;
        float expected = 317.9999f;
        float out = Converter.euroToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}