package dbus.game;

import dbus.card.Card;
import dbus.deck.Deck;
import dbus.score.calcultaor.ScoreCalculator;

import java.util.function.Function;

import static dbus.score.calcultaor.ScoreCalculator.scoreCalculatorFor;

final public class Game {

    private final Deck deck;
    private ScoreCalculator<Card> cardScoreCalculator;

    public <M extends Game.Mode> Game(Deck deck, M mode) {
        this.deck = deck;
        cardScoreCalculator = scoreCalculatorFor(mode);
    }

    public static Game standardGame(Deck deck) {
        return new Game(deck, Mode.STANDARD);
    }

    public static Game standardGame(Card... cards) {
        return createGame(Mode.Standard.STANDARD, cards);
    }

    public static Game beginnerGame(Deck deck) {
        return new Game(deck, Mode.BEGINNER);
    }

    public static Game beginnerGame(Card... cards) {
        return createGame(Mode.BEGINNER, cards);
    }

    private static <M extends Game.Mode> Game createGame(M mode, Card... cards) {
        return new Game(Deck.with(cards), mode);
    }

    public int score() {
        return deck.calculateScoreWith(cardScoreCalculator);
    }

    public interface Mode {

        Standard STANDARD = Standard.STANDARD;
        Beginner BEGINNER = Beginner.BEGINNER;

        <R> R match(
                Function<Standard, R> StandardCase,
                Function<Beginner, R> beginnerCase
        );

        enum Standard implements Mode {
            STANDARD;

            @Override
            public <R> R match(Function<Standard, R> standardCase, Function<Beginner, R> beginnerCase) {
                return standardCase.apply(this);
            }
        }

        enum Beginner implements Mode {
            BEGINNER;

            @Override
            public <R> R match(Function<Standard, R> StandardCase, Function<Beginner, R> beginnerCase) {
                return beginnerCase.apply(this);
            }
        }
    }
}
