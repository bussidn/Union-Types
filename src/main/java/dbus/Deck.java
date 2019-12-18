package dbus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Deck {
    private final List<Card> cards;
    private final StandardScoreCalculator standardScoreCalculator = new StandardScoreCalculator();

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
                .mapToInt(card -> card.visit(standardScoreCalculator))
                .sum();
    }
}
