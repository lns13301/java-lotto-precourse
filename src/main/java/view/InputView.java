package view;

import java.util.Scanner;

public class InputView {
    private static final String NEW_LINE = "\n";
    private static final String INPUT_MONEY_MISMATCH_MESSAGE = "[ERROR] 구입 금액 입력이 잘못되었습니다. (양의 정수 입력)";
    private static final String INPUT_NUMBER_MISMATCH_MESSAGE = "[ERROR] 당첨 번호 입력이 잘못되었습니다.";

    public static void inputMoneyToBuyLotto(Scanner scanner) {
        System.out.println(NEW_LINE + "구입 금액을 입력해 주세요.");

        try {
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println(NEW_LINE + INPUT_MONEY_MISMATCH_MESSAGE);
            inputMoneyToBuyLotto(scanner);
        }
    }

    public static void inputLottoNumbers(Scanner scanner) {
        System.out.println(NEW_LINE + "지난 주 당첨 번호를 입력해 주세요.");

        try {
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println(INPUT_NUMBER_MISMATCH_MESSAGE);
            inputLottoNumbers(scanner);
        }
    }
}
