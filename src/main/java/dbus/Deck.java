package dbus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Deck {
    private final List<Card> cards;
    private final StandardScoreCalculator standardScoreCalculator = new StandardScoreCalculator();
    private final ToString toStringFunction = new ToString();

    private Deck(List<Card> cards) {
        this.cards = cards;
    }

    private Deck() {
        this.cards = new ArrayList<>();
    }

    static Deck empty() {
        return new Deck();
    }

    static Deck with(Card... card) {
        return new Deck(new ArrayList<>(Arrays.asList(card)));
    }

    Integer score() {
        return cards.stream()
                .peek(printCard())
                .mapToInt(card -> card.visit(standardScoreCalculator))
                .sum();
    }

    private Consumer<Card> printCard() {
        return card -> System.out.println(card.visit(toStringFunction));
    }
}
