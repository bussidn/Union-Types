package dbus;

import java.util.function.Function;

interface Card {

    Spade SPADE = Spade.INSTANCE;
    Heart HEART = Heart.INSTANCE;
    Diamond DIAMOND = Diamond.INSTANCE;
    Club CLUB = Club.INSTANCE;

    <R> R match(
            Function<Spade, R> spadeCase,
            Function<Heart, R> heartCase,
            Function<Diamond, R> diamondCase,
            Function<Club, R> clubCase
    );

    enum Spade implements Card {
        INSTANCE;

        @Override
        public <R> R match(Function<Spade, R> spadeCase, Function<Heart, R> heartCase, Function<Diamond, R> diamondCase, Function<Club, R> clubCase) {
            return spadeCase.apply(this);
        }
    }

    enum Heart implements Card {
        INSTANCE;

        @Override
        public <R> R match(Function<Spade, R> spadeCase, Function<Heart, R> heartCase, Function<Diamond, R> diamondCase, Function<Club, R> clubCase) {
            return heartCase.apply(this);
        }

    }

    enum Diamond implements Card {
        INSTANCE;

        @Override
        public <R> R match(Function<Spade, R> spadeCase, Function<Heart, R> heartCase, Function<Diamond, R> diamondCase, Function<Club, R> clubCase) {
            return diamondCase.apply(this);
        }

    }

    enum Club implements Card {
        INSTANCE;

        @Override
        public <R> R match(Function<Spade, R> spadeCase, Function<Heart, R> heartCase, Function<Diamond, R> diamondCase, Function<Club, R> clubCase) {
            return clubCase.apply(this);
        }

    }
}
