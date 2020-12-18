package view;

import domain.Lotto;

import java.util.IllformedLocaleException;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String NEW_LINE = "\n";
    private static final String INPUT_MONEY_MISMATCH_MESSAGE = "[ERROR] 구입 금액 입력이 잘못되었습니다. (양의 정수 입력)";
    private static final String INPUT_NUMBER_MISMATCH_MESSAGE = "[ERROR] 당첨 번호 입력이 잘못되었습니다.";
    private static final String INPUT_BONUS_NUMBER_MISMATCH_MESSAGE = "[ERROR] 보너스 번호 입력이 잘못되었습니다.";

    public static int inputMoneyToBuyLotto(Scanner scanner) {
        System.out.println(NEW_LINE + "구입 금액을 입력해 주세요.");

        try {
            return InputValidator.validateMoney(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println(NEW_LINE + INPUT_MONEY_MISMATCH_MESSAGE);
            return inputMoneyToBuyLotto(scanner);
        }
    }

    public static List<Integer> inputLottoNumbers(Scanner scanner) {
        System.out.println(NEW_LINE + "지난 주 당첨 번호를 입력해 주세요.");

        try {
            return InputValidator.validateNumbers(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println(INPUT_NUMBER_MISMATCH_MESSAGE);
            return inputLottoNumbers(scanner);
        }
    }
    
    public static int inputBonusNumber(Scanner scanner, Lotto lotto) {
        System.out.println(NEW_LINE + "보너스 볼을 입력해 주세요.");

        try {
            return InputValidator.validateBonusNumber(lotto.getNumbers(), scanner.nextLine());
        } catch (IllformedLocaleException e) {
            System.out.println(INPUT_BONUS_NUMBER_MISMATCH_MESSAGE);
            return inputBonusNumber(scanner, lotto);
        }
    }
}
