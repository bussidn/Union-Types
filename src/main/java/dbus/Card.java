package dbus;

interface Card {

    Spade SPADE = Spade.INSTANCE;
    Heart HEART = Heart.INSTANCE;
    Diamond DIAMOND = Diamond.INSTANCE;
    Club CLUB = Club.INSTANCE;

    default int score() {
        if (this instanceof Spade)
            return 1;
        else if (this instanceof Heart)
            return 2;
        throw new RuntimeException(new IllegalAccessException());
    }

    enum Spade implements Card {
        INSTANCE
    }

    enum Heart implements Card {
        INSTANCE
    }

    enum Diamond implements Card {
        INSTANCE
    }

    enum Club implements Card {
        INSTANCE
    }
}
