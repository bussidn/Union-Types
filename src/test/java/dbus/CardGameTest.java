package dbus;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CardGameTest {

    @Test
    void test() {
        Deck deck = Deck.empty();

        Integer score = deck.score();

        assertThat(score).isEqualTo(0);
    }
}
