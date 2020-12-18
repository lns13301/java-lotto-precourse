package view;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputValidator {
    private static final String NUMBER_SPLIT_UNIT = ",";
    private static final int NUMBER_COUNT = 6;
    private static final int NUMBER_MIN = 1;
    private static final int NUMBER_MAX = 45;

    public static int validateMoney(String inputMoney) {
        try {
            int money = Integer.parseInt(inputMoney);

            validateOverZero(money);

            return money;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateOverZero(int value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static List<Integer> validateNumbers(String inputNumbers) {
        try {
            String[] split = inputNumbers.split(NUMBER_SPLIT_UNIT);

            return validateNumberFormat(Arrays.stream(split)
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .collect(Collectors.toList()));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    private static List<Integer> validateNumberFormat(List<Integer> numbers) {
        if (numbers.stream().distinct().count() != NUMBER_COUNT) {
            throw new IllegalArgumentException();
        }

        if (!numbers.stream().allMatch(number -> number > NUMBER_MIN && number < NUMBER_MAX)) {
            throw new IllegalArgumentException();
        }

        return numbers;
    }
}
