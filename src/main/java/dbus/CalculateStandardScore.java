package dbus;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public enum CalculateStandardScore implements ToIntFunction<Card> {
    INSTANCE;

    public int calculateScore(Card card) {
        return card.match(
                spade -> 1,
                heart -> 2,
                diamond -> 4,
                club -> 8
        );
    }

    @Override
    public int applyAsInt(Card card) {
        return calculateScore(card);
    }
}
