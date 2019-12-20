package dbus.score.calcultaor;

import dbus.card.Card;
import dbus.game.Game;

import java.util.function.ToIntFunction;

@FunctionalInterface
public interface ScoreCalculator<T> extends ToIntFunction<T>{

    int score(T t);

    @Override
    default int applyAsInt(T value) {
        return score(value);
    }

    static ScoreCalculator<Card> scoreCalculatorFor(Game.Mode mode) {
        return mode.match(
                STD -> CalculateStandardCardScore.INSTANCE,
                BEG -> CalculateBeginnerCardScore.INSTANCE
        );
    }
}
