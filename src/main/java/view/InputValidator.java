package view;

public class InputValidator {
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
}
