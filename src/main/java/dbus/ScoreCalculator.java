package dbus;

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
                STD -> CalculateStandardScore.INSTANCE,
                BEG -> CalculateBeginnerScore.INSTANCE
        );
    }
}
