package domain;

import util.RandomGenerator;
import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.Scanner;

public class LottoManager {
    private static final int LOTTO_PRICE = 1000;

    private Lottos lottos;
    private WinningLotto winninglotto;

    public void doLotto(Scanner scanner) {
        lottos = new Lottos(makeNumbers(showInputMoney(scanner)));
        Lotto lotto = new Lotto(showInputNumbers(scanner));
        winninglotto = new WinningLotto(lotto, showInputBonusNumber(scanner, lotto));

        showResult();
    }

    public int showInputMoney(Scanner scanner) {
        return getBoughtCount(InputView.inputMoneyToBuyLotto(scanner));
    }

    private int getBoughtCount(int money) {
        return money / LOTTO_PRICE;
    }

    public List<Lotto> makeNumbers(int count) {
        OutputView.printBuyCount(count);

        return RandomGenerator.random(count);
    }

    public List<Integer> showInputNumbers(Scanner scanner) {
        return InputView.inputLottoNumbers(scanner);
    }

    public int showInputBonusNumber(Scanner scanner, Lotto lotto) {
        return InputView.inputBonusNumber(scanner, lotto);
    }

    public void showResult() {
        lottos.showResult(winninglotto);
    }
}
