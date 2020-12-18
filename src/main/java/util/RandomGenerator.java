package util;

import domain.Lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class RandomGenerator {
    private static final int NUMBER_COUNT = 6;
    private static final int NUMBER_MIN = 1;
    private static final int NUMBER_MAX = 46;

    public static List<Lotto> random(int count) {
        List<Lotto> lottos = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            lottos.add(makeLotto());
        }

        return lottos;
    }

    private static Lotto makeLotto() {
        return new Lotto(ThreadLocalRandom.current()
                .ints(NUMBER_MIN, NUMBER_MAX)
                .distinct()
                .limit(NUMBER_COUNT)
                .boxed()
                .collect(Collectors.toList()));
    }
}
