package dbus;

public enum CalculateStandardScore implements ScoreCalculator<Card> {
    INSTANCE;

    public int score(Card card) {
        return card.match(
                SPADE -> 1,
                HEART -> 2,
                DIAMOND -> 4,
                CLUB -> 8
        );
    }
}
