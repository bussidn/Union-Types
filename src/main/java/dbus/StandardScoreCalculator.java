package dbus;

public class StandardScoreCalculator implements CardVisitor<Integer> {
    @Override
    public Integer visit(Card.Spade spade) {
        return 1;
    }

    @Override
    public Integer visit(Card.Heart heart) {
        return 2;
    }

    @Override
    public Integer visit(Card.Diamond diamond) {
        return 4;
    }

    @Override
    public Integer visit(Card.Club club) {
        return 8;
    }
}
