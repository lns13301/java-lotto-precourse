package util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class RandomGenerator {
    private static final int NUMBER_COUNT = 6;
    private static final int NUMBER_MIN = 1;
    private static final int NUMBER_MAX = 46;

    public static List<List<Integer>> random(int count) {
        List<List<Integer>> boughtNumbers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            boughtNumbers.add(makeNumbers());
        }

        return boughtNumbers;
    }

    private static List<Integer> makeNumbers() {
        return ThreadLocalRandom.current()
                .ints(NUMBER_MIN, NUMBER_MAX)
                .distinct()
                .limit(NUMBER_COUNT)
                .boxed()
                .collect(Collectors.toList());
    }
}
