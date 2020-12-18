package domain;

import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.Scanner;

public class LottoManager {
    private static final int LOTTO_PRICE = 1000;

    public void doLotto(Scanner scanner) {
        int boughtCount = viewInputMoney(scanner);
        OutputView.printBuyCount(boughtCount);

        List<Integer> numbers = viewInputNumbers(scanner);
        int bonusNumber = viewInputBonusNumber(scanner, numbers);
    }

    public int viewInputMoney(Scanner scanner) {
        return getBoughtCount(InputView.inputMoneyToBuyLotto(scanner));
    }

    private int getBoughtCount(int money) {
        return money / LOTTO_PRICE;
    }

    public List<Integer> viewInputNumbers(Scanner scanner) {
        return InputView.inputLottoNumbers(scanner);
    }

    public int viewInputBonusNumber(Scanner scanner, List<Integer> numbers) {
        return InputView.inputBonusNumber(scanner, numbers);
    }
}
