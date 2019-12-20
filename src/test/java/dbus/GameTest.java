package dbus;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {

    @Nested
    class StandardGameTest {

        @Test
        void score_should_be_zero_when_deck_is_empty() {
            Game Game = dbus.Game.standardGame(Deck.empty());

            Integer score = Game.score();

            assertThat(score).isEqualTo(0);
        }

        @Test
        void score_should_be_one_when_deck_contains_one_spade() {
            Game Game = dbus.Game.standardGame(Card.SPADE);

            Integer score = Game.score();

            assertThat(score).isEqualTo(1);
        }

        @Test
        void score_should_be_two_when_deck_contains_two_spades() {
            Game Game = dbus.Game.standardGame(Card.SPADE, Card.SPADE);

            Integer score = Game.score();

            assertThat(score).isEqualTo(2);
        }

        @Test
        void score_should_be_three_when_deck_contains_one_spades_and_one_heart() {
            Game Game = dbus.Game.standardGame(Card.SPADE, Card.HEART);

            Integer score = Game.score();

            assertThat(score).isEqualTo(3);
        }

        @Test
        void score_should_be_five_when_deck_contains_one_spades_and_one_diamond() {
            Game Game = dbus.Game.standardGame(Card.SPADE, Card.DIAMOND);

            Integer score = Game.score();

            assertThat(score).isEqualTo(5);
        }

        @Test
        void score_should_be_nine_when_deck_contains_one_spades_and_one_club() {
            Game Game = dbus.Game.standardGame(Card.SPADE, Card.CLUB);

            Integer score = Game.score();

            assertThat(score).isEqualTo(9);
        }

    }

    @Nested
    class BeginnerGameTest {

        @Test
        void score_should_be_zero_when_deck_is_empty() {
            Game Game = dbus.Game.beginnerGame(Deck.empty());

            Integer score = Game.score();

            assertThat(score).isEqualTo(0);
        }

        @Test
        void score_should_be_one_when_deck_contains_one_spade() {
            Game Game = dbus.Game.beginnerGame(Card.SPADE);

            Integer score = Game.score();

            assertThat(score).isEqualTo(1);
        }

        @Test
        void score_should_be_two_when_deck_contains_two_spades() {
            Game Game = dbus.Game.beginnerGame(Card.SPADE, Card.SPADE);

            Integer score = Game.score();

            assertThat(score).isEqualTo(2);
        }

        @Test
        void score_should_be_three_when_deck_contains_one_spades_and_one_heart() {
            Game Game = dbus.Game.beginnerGame(Card.SPADE, Card.HEART);

            Integer score = Game.score();

            assertThat(score).isEqualTo(3);
        }

        @Test
        void score_should_be_five_when_deck_contains_one_spades_and_one_diamond() {
            Game Game = dbus.Game.beginnerGame(Card.SPADE, Card.DIAMOND);

            Integer score = Game.score();

            assertThat(score).isEqualTo(4);
        }

        @Test
        void score_should_be_nine_when_deck_contains_one_spades_and_one_club() {
            Game Game = dbus.Game.beginnerGame(Card.SPADE, Card.CLUB);

            Integer score = Game.score();

            assertThat(score).isEqualTo(5);
        }

    }
}
