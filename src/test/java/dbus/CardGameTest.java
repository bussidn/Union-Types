package dbus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CardGameTest {

    @Test
    void score_should_be_zero_when_deck_is_empty() {
        Deck deck = Deck.empty();

        Integer score = deck.score();

        assertThat(score).isEqualTo(0);
    }

    @Test
    void score_should_be_one_when_deck_contains_one_spade() {
        Deck deck = Deck.with(Card.SPADE);

        Integer score = deck.score();

        assertThat(score).isEqualTo(1);
    }

    @Test
    void score_should_be_two_when_deck_contains_two_spades() {
        Deck deck = Deck.with(Card.SPADE, Card.SPADE);

        Integer score = deck.score();

        assertThat(score).isEqualTo(2);
    }

    @Test
    void score_should_be_three_when_deck_contains_one_spades_and_one_heart() {
        Deck deck = Deck.with(Card.SPADE, Card.HEART);

        Integer score = deck.score();

        assertThat(score).isEqualTo(3);
    }

    @Test
    void score_should_be_five_when_deck_contains_one_spades_and_one_diamond() {
        Deck deck = Deck.with(Card.SPADE, Card.DIAMOND);

        Integer score = deck.score();

        assertThat(score).isEqualTo(5);
    }

    @Test
    void score_should_be_nine_when_deck_contains_one_spades_and_one_club() {
        Deck deck = Deck.with(Card.SPADE, Card.CLUB);

        Integer score = deck.score();

        assertThat(score).isEqualTo(9);
    }
}
