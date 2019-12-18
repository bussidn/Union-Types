package dbus;

interface Card {

    Spade SPADE = Spade.INSTANCE;
    Heart HEART = Heart.INSTANCE;
    Diamond DIAMOND = Diamond.INSTANCE;
    Club CLUB = Club.INSTANCE;

    int score();


    enum Spade implements Card {
        INSTANCE;

        @Override
        public int score() {
            return 1;
        }
    }

    enum Heart implements Card {
        INSTANCE;

        @Override
        public int score() {
            return 2;
        }
    }

    enum Diamond implements Card {
        INSTANCE;

        @Override
        public int score() {
            return 4;
        }
    }

    enum Club implements Card {
        INSTANCE;

        @Override
        public int score() {
            return 8;
        }
    }
}
