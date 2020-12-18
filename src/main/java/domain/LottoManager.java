package domain;

import util.RandomGenerator;
import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.Scanner;

public class LottoManager {
    private static final int LOTTO_PRICE = 1000;

    private Lottos lottos;
    private Lotto lotto;

    public void doLotto(Scanner scanner) {
        lottos = new Lottos(makeNumbers(viewInputMoney(scanner)));
        lotto = new Lotto(viewInputNumbers(scanner));
        int bonusNumber = viewInputBonusNumber(scanner, lotto);
    }

    public int viewInputMoney(Scanner scanner) {
        return getBoughtCount(InputView.inputMoneyToBuyLotto(scanner));
    }

    private int getBoughtCount(int money) {
        return money / LOTTO_PRICE;
    }

    public List<Lotto> makeNumbers(int count) {
        OutputView.printBuyCount(count);

        return RandomGenerator.random(count);
    }

    public List<Integer> viewInputNumbers(Scanner scanner) {
        return InputView.inputLottoNumbers(scanner);
    }

    public int viewInputBonusNumber(Scanner scanner, Lotto lotto) {
        return InputView.inputBonusNumber(scanner, lotto);
    }
}
