package dbus;

public class ToString implements CardVisitor<String> {
    @Override
    public String visit(Card.Spade spade) {
        return "Spade";
    }

    @Override
    public String visit(Card.Heart heart) {
        return "Heart";
    }

    @Override
    public String visit(Card.Diamond diamond) {
        return "Diamond";
    }

    @Override
    public String visit(Card.Club club) {
        return "Club";
    }
}
