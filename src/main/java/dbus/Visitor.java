package dbus;

interface Visitor<T> {
    T visit(Card.Spade spade);
    T visit(Card.Heart heart);
    T visit(Card.Diamond diamond);
    T visit(Card.Club club);
}
