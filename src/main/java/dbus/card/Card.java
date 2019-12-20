package dbus.card;

import java.util.function.Function;

public interface Card {

    Spade SPADE = Spade.SPADE;
    Heart HEART = Heart.HEART;
    Diamond DIAMOND = Diamond.DIAMOND;
    Club CLUB = Club.CLUB;

    <R> R match(
            Function<Spade, R> spadeCase,
            Function<Heart, R> heartCase,
            Function<Diamond, R> diamondCase,
            Function<Club, R> clubCase
    );

    enum Spade implements Card {
        SPADE;

        @Override
        public <R> R match(Function<Spade, R> spadeCase, Function<Heart, R> heartCase, Function<Diamond, R> diamondCase, Function<Club, R> clubCase) {
            return spadeCase.apply(this);
        }
    }

    enum Heart implements Card {
        HEART;

        @Override
        public <R> R match(Function<Spade, R> spadeCase, Function<Heart, R> heartCase, Function<Diamond, R> diamondCase, Function<Club, R> clubCase) {
            return heartCase.apply(this);
        }

    }

    enum Diamond implements Card {
        DIAMOND;

        @Override
        public <R> R match(Function<Spade, R> spadeCase, Function<Heart, R> heartCase, Function<Diamond, R> diamondCase, Function<Club, R> clubCase) {
            return diamondCase.apply(this);
        }

    }

    enum Club implements Card {
        CLUB;

        @Override
        public <R> R match(Function<Spade, R> spadeCase, Function<Heart, R> heartCase, Function<Diamond, R> diamondCase, Function<Club, R> clubCase) {
            return clubCase.apply(this);
        }

    }
}
