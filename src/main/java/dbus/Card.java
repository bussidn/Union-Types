package dbus;

interface Card {

    Spade SPADE = Spade.INSTANCE;
    Heart HEART = Heart.INSTANCE;
    Diamond DIAMOND = Diamond.INSTANCE;
    Club CLUB = Club.INSTANCE;


    <T> T visit(CardVisitor<T> cardVisitor);

    enum Spade implements Card {
        INSTANCE;

        public <T> T visit(CardVisitor<T> cardVisitor) {
            return cardVisitor.visit(this);
        }
    }

    enum Heart implements Card {
        INSTANCE;

        public <T> T visit(CardVisitor<T> cardVisitor) {
            return cardVisitor.visit(this);
        }

    }

    enum Diamond implements Card {
        INSTANCE;

        public <T> T visit(CardVisitor<T> cardVisitor) {
            return cardVisitor.visit(this);
        }

    }

    enum Club implements Card {
        INSTANCE;

        @Override
        public <T> T visit(CardVisitor<T> cardVisitor) {
            return cardVisitor.visit(this);
        }

    }
}
