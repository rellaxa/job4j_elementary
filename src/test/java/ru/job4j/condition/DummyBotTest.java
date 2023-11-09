package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String in = "Hi bot.";
        String rsl = DummyBot.answer(in);
        String expected = "Hi, SmartAss.";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String rsl = DummyBot.answer("Bye.");
        assertThat(rsl).isEqualTo("See you later.");
    }

    @Test
    void whenUnknownBot() {
        String rsl = DummyBot.answer("What's up?");
        assertThat(rsl).isEqualTo("I don't know. Please, ask another question.");
    }
}