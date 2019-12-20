package dbus;

public enum CalculateBeginnerScore implements ScoreCalculator<Card> {
    INSTANCE;

    public int score(Card card) {
        return card.match(
                SPADE -> 1,
                HEART -> 2,
                DIAMOND -> 3,
                CLUB -> 4
        );
    }
}
