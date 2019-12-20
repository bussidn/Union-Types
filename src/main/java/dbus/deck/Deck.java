package dbus.deck;

import dbus.card.Card;
import dbus.score.calcultaor.ScoreCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Deck {
    private final List<Card> cards;

    private Deck(List<Card> cards) {
        this.cards = cards;
    }

    private Deck() {
        this.cards = new ArrayList<>();
    }

    public static Deck empty() {
        return new Deck();
    }

    public static Deck with(Card... card) {
        return new Deck(new ArrayList<>(Arrays.asList(card)));
    }

    public int calculateScoreWith(ScoreCalculator<Card> cardScoreCalculator) {
        return cards.stream()
                .peek(printCard())
                .mapToInt(cardScoreCalculator)
                .sum();
    }

    private static Consumer<Card> printCard() {
        return card -> System.out.println(card.toString());
    }

}
